package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeMySqlDAOImpl implements IEmployeeDAO {
	private static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO REALTMEDI_SPRING_EMPLOYEE(ENAME,DESG,BASICSALARY,GROSSSALARY,NETSALARY) VALUES(?,?,?,?,?)";
	// HAS-A relation to inject datasource
	private DataSource ds;

	public EmployeeMySqlDAOImpl(DataSource ds) {
		System.out.println("EmployeeMySqlDAOImpl :: 1-param constructor");
		this.ds = ds;
	}

	/*@Override
	public int saveEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl :: saveEmployee()");
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			// get pooled jdbc connection
			if (ds != null)
				con = ds.getConnection();
	
			// create PreparedStatement having predefine query
			if (con != null)
				ps = con.prepareStatement(INSERT_EMPLOYEE_QUERY);
	
			// set values to query param
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
	
			// send and execute the sql query from database
			if (ps != null)
				count = ps.executeUpdate();
			return count;
		} catch (SQLException se) {
			se.printStackTrace();
			throw se; // exception re-throwing
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // exception re-throwing
		} finally {
			// close jdbc objects
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		} // end of finally block   */

	// using try-with-resource
	public int saveEmployee(EmployeeBO bo) throws Exception {
		int count = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(INSERT_EMPLOYEE_QUERY);) {

			// set values to query param
			ps.setString(1, bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());

			// send and execute the sql query from database
			if (ps != null)
				count = ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se; // exception re-throwing
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // exception re-throwing
		}
		return count;
	}// end of saveEmployee(-)
}