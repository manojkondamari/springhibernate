package com.mano.spring.springhibernate.business;

import java.util.List;

import com.mano.spring.springhibernate.entities.Employee;

public interface EmployeeBusiness {
	
	public void save(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Employee employee);
	
	public Employee findById(int Id);
	
	public List<Employee> findAll();
}
