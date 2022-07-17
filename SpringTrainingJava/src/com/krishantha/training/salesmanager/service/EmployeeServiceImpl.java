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
import org.springframework.context.annotation.Configuration;


/**
 *
 * @author Ahsika
 * 
 * 
 */

public class EmployeeServiceImpl implements EmployeeService{
    
    
   
    EmployeeRepository employeeRepository ;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        System.out.println("overload constructore executed");
        this.employeeRepository = employeeRepository;
    }
    
    public EmployeeServiceImpl() {
        System.out.println("default constructore executed");
        
    }
    
    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }
    
     @Autowired
    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        System.out.println("setter executed");
        this.employeeRepository = employeeRepository;
    }
    
    
    
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }
    
}
