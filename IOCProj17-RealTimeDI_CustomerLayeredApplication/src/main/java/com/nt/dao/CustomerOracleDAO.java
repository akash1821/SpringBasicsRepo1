package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerOracleDAO implements ICustomerDAO {
	private static final String INSERT_CUST_DETAILS = "INSERT INTO REALTIMEDI_SPRING_CUSTOMER VALUES(SP_REALTIMEDI_CID_SEQ.NEXTVAL,?,?,?,?,?,?)";

	private DataSource ds;

	public CustomerOracleDAO(DataSource ds) {
		System.out.println("CustomerOracleDAO :: 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int saveCustomer(CustomerBO bo) throws Exception {
		System.out.println("CustomerOracleDAO :: saveCustomer()");
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			// get pooled jdbc connection
			if (ds != null)
				con = ds.getConnection();

			// create PreparedStatement having pre-compiled query
			if (con != null)
				ps = con.prepareStatement(INSERT_CUST_DETAILS);

			// set values to query param
			if (ps != null) {
				ps.setString(1, bo.getCustName());
				ps.setString(2, bo.getCustAddrs());
				ps.setString(3, bo.getCustItem());
				ps.setFloat(4, bo.getItemPrice());
				ps.setDate(5, bo.getPurchaseDate());
				ps.setFloat(6, bo.getBillAmt());
			}

			// send and execute sql query from db
			if (ps != null)
				count = ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se; // exception re-throwing
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // exception re-throwing
		}
		// close jdbc connections in finally block
		finally {
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
		} // end of finally block
		return count;
	}

}
