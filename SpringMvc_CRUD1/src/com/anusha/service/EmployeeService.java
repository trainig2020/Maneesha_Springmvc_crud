package com.anusha.service;

import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.anusha.dao.EmployeeDao;
import com.anusha.model.Employee;



@Service
@Transactional
public class EmployeeService {
    
	@Autowired
	private EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployees(int deptid){
		return employeeDao.getAllEmployees(deptid);
	}
	
	 public void insertEmployee(Employee employee) {
    	 employeeDao.insertEmployee(employee);
     }
     
     public void deleteEmployee(int empid,int did) {
    	 employeeDao.deleteEmployee(empid,did);
     }
     public Employee getEmployee(int empid) {
    	 return employeeDao.getEmployee(empid);
     }
     public String updateEmployee(int employeeId,int did,String empname) {
    	 return employeeDao.updateEmployee(employeeId,did,empname);
     }
}