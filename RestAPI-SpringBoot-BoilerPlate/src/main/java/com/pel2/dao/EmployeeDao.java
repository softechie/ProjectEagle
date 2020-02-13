package com.pel2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.pel2.dto.Employee;
import com.pel2.encryption.AES;

import enums.EnumIsRelocate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

/**
 * @author mbaransln
 * This is sample DAO class to fetch the employee details. 
 * Once DB is available and tables are created, we can uncomment the below code.
 * 
 */
public interface EmployeeDao  {
    public Employee getEmployee(String id);

    public Iterable<Employee> getEmployees();

    public int saveEmployee(final Employee employee) throws SQLException, ParseException;

    public boolean updateEmployee(final Employee employee) throws SQLException, ParseException;

    public boolean deleteEmployee(String empid) throws SQLException;

	public boolean delAllEmployees();
	
	//public int  addAllEmployee(final Employee employee) throws SQLException, ParseException;
	//   public Iterable<Employee> addAllEmployee();
}