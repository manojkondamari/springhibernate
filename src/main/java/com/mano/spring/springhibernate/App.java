package com.mano.spring.springhibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mano.spring.springhibernate.business.EmployeeBusinessImpl;
import com.mano.spring.springhibernate.entities.Employee;
import com.mano.spring.springhibernate.business.EmployeeBusiness;

public class App 
{
    public static void main( String[] args )
    {
        
		ApplicationContext context=new ClassPathXmlApplicationContext("configmetadata.xml");
        
        EmployeeBusiness employeeBusiness = (EmployeeBusinessImpl)context.getBean("employeeBusinessImpl");
        
       // saving employee details into database //
//        Employee employee=new Employee();
//        employee.setId(4);
//        employee.setEname("Naresh");
//        employee.setContact("903284849");
//        employee.setAddress("Madanapalle");
//        employee.setExp(23);
//        employeeBusiness.save(employee)
        
        ////////////  retrive and update single employee //////////
//        Employee employee=employeeBusiness.findById(2);
//        employee.setEname("Blacky");
//        employeeBusiness.update(employee);
        
//        Employee employee=employeeBusiness.findById(2);
//        employeeBusiness.delete(employee);
        
        List<Employee> employee=employeeBusiness.findAll();
        for(Employee e:employee) {
        	System.out.println(e.getEname());
        }
    }
}
