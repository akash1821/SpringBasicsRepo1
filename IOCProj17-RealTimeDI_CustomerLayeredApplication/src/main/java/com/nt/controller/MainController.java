package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerService;
import com.nt.vo.CustomerVO;

public class MainController {

	private ICustomerService service;

	public MainController(ICustomerService service) {
		System.out.println("MainController :: 1-param constructor");
		this.service = service;
	}

	public String saveCustomer(CustomerVO vo) throws Exception {
		System.out.println("MainController :: saveCustomer()");
		Date udate = null;
		java.sql.Date sdate = null;
		SimpleDateFormat sdf = null;
		// convert vo int dto
		CustomerDTO dto = new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setCustItem(vo.getCustItem());
		dto.setItemPrice(Float.parseFloat(vo.getItemPrice()));

		// convert simple String formate date into sql date value
		// 1. use SimpleDateFormate
		sdf = new SimpleDateFormat("dd/MM/yyyy");

		// 2. convert the SimpleDateFormate to java.util.Date format
		if (sdf != null)
			udate = sdf.parse(vo.getPurchaseDate());

		// 3. convert the java.util.Date value to java.sql.Date value
		if (udate != null)
			sdate = new java.sql.Date(udate.getTime());

		// set the converted String Date value to java.sql.Date value
		dto.setPurchaseDate(sdate);

		// use service to invoke method
		String result = service.saveCustomer(dto);

		return result;
	}

}
