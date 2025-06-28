package com.mano.spring.springhibernate.dao;

import java.util.List;

import com.mano.spring.springhibernate.entities.Employee;

public interface EmployeeDao {
	
	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	
	public Employee findById(int Id);
	
	public List<Employee> findAll();
}
