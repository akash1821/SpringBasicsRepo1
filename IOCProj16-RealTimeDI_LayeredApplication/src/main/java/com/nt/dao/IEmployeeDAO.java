package com.nt.dao;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {
	public int saveEmployee(EmployeeBO bo) throws Exception;
}
