package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.dao.EmployeeOracleDAOImpl;
import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;
import com.nt.vo.EmployeeVO;

@RestController
@RequestMapping("/rest/api/employee")
public class MainRestController {
	private IEmployeeService service;
	@PostMapping("/save")
	public ResponseEntity<String> saveEmplyee(@RequestBody EmployeeVO vo){
		String result = null;
		//convert vo into dto 
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		try {
		// use service
		result = service.saveEmployee(dto);
		}catch(Exception e) {
		System.out.println("Internal Problem Try Again!");
		}
		return new ResponseEntity<String>(result,HttpStatus.OK);
	}
}
