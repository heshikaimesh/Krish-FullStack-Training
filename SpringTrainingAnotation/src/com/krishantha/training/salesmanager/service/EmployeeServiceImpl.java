/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krishantha.training.salesmanager.service;

import java.util.List;



import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Ahsika
 * 
 * 
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
    
    
    EmployeeRepository employeeRepository ;
    
    public EmployeeServiceImpl() {
        System.out.println("Default constructore executed");
    }

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        System.out.println("overloaded contructore executed");
        this.employeeRepository = employeeRepository;
    }
    
    

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }
    
    @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("Setter injection fired");
        this.employeeRepository = employeeRepository;
    }
    
    
    
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }
    
}
