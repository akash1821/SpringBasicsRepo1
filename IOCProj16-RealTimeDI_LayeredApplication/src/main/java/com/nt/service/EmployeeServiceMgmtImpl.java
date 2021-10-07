package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceMgmtImpl implements IEmployeeService {

	// HAS-A relation to inject dao to service layer
	private IEmployeeDAO dao;

	public EmployeeServiceMgmtImpl(IEmployeeDAO dao) {
		System.out.println("EmployeeServiceMgmtImpl :: 1-param constructor");
		this.dao = dao;
	}

	@Override
	public String saveEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeServiceMgmtImpl :: saveEmployee()");

		// generate b.logic (gross salary and net salary based on basic salary)
		float grossSalary = dto.getBasicSalary() + dto.getBasicSalary() * 0.4f;
		float netSalary = grossSalary - dto.getBasicSalary() * 0.2f;

		// set DTO values to BO
		EmployeeBO bo = new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		//use dao
		int count = dao.saveEmployee(bo);
		return count==0?"Employee Registration Failed with netSalary : "+netSalary : "Employee Registration Succeeded with netSalary : "+netSalary;
	}

}
