package com.mano.spring.springhibernate.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mano.spring.springhibernate.dao.EmployeeDao;
import com.mano.spring.springhibernate.entities.Employee;
@Component
public class EmployeeBusinessImpl implements EmployeeBusiness {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.update(employee);
	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.delete(employee);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		
		return employeeDao.findById(id);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

}
