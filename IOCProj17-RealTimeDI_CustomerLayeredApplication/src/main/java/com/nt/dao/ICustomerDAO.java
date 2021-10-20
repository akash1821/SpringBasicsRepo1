package com.nt.dao;

import com.nt.bo.CustomerBO;

public interface ICustomerDAO {
	public int saveCustomer(CustomerBO bo) throws Exception; 
}
