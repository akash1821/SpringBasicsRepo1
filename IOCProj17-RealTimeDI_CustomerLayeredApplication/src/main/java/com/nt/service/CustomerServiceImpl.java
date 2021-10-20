package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDAO dao;
	
	public CustomerServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerServiceImpl :: 1-param constructor");
		this.dao = dao;
	}

	@Override
	public String saveCustomer(CustomerDTO dto) throws Exception {
		System.out.println("CustomerServiceImpl :: saveCustomer()");
		float billAmt=0.0f;
		float discountAmt=0.0f;
		// applying  GST on Item Price
		if(dto.getItemPrice()>5000)
			billAmt=(float) ((0.5*dto.getItemPrice())+dto.getItemPrice());
		else if(dto.getItemPrice()>20000)
			billAmt=(float) ((0.12*dto.getItemPrice())+dto.getItemPrice());
		else if(dto.getItemPrice()>50000)
			billAmt= (float) ((0.18*dto.getItemPrice())+dto.getItemPrice());
		
		// generate discount on billAmt
		if(billAmt>5000)
			discountAmt=(float) ((billAmt)-(billAmt*0.5));
		else if(billAmt>20000)
			discountAmt=(float) ((billAmt)-(billAmt*0.10));
		else if(billAmt>50000)
			discountAmt=(float) ((billAmt)-(billAmt*0.15));
		else if(billAmt>100000)
			discountAmt=(float) ((billAmt)-(billAmt*0.20));
		
		//set dto values to bo
		CustomerBO bo = new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setCustItem(dto.getCustItem());
		bo.setItemPrice(dto.getItemPrice());
		bo.setPurchaseDate(dto.getPurchaseDate());
		bo.setBillAmt(discountAmt);
		
		//use dao
		int count = dao.saveCustomer(bo);
		return count==0?"Customer registration failed":"Customer registration Succeeded with bill amount "+billAmt;
	}

}
