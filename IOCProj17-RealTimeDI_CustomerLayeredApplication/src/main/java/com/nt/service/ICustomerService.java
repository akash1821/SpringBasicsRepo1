package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface ICustomerService {
	public String saveCustomer(CustomerDTO dto) throws Exception;
}
