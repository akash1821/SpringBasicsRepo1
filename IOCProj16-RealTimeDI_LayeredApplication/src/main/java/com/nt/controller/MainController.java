package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;

public final class MainController {
	// HAS-A relation to inject service to controller
	private IEmployeeService service;

	public MainController(IEmployeeService service) {
		this.service = service;
	}

	public String saveEmployee(EmployeeVO vo) throws Exception {
		//convert vo properties to dto 
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		
		//use service 
		String result = service.saveEmployee(dto);
		return result;
	}
}
