package com.mano.spring.springhibernate.dao;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mano.spring.springhibernate.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional(readOnly=false)
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(employee);
	}

	@Override
	@Transactional(readOnly=false)
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(employee);
		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(employee);
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		Employee emp=hibernateTemplate.get(Employee.class, id);
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		List <Employee> emp=hibernateTemplate.loadAll(Employee.class);
		return emp;
	}
	
}
