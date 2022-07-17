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


/**
 *
 * @author Ahsika
 * 
 * 
 */

public class EmployeeServiceImpl implements EmployeeService{
    
    private EmployeeRepository employeeRepository ;

    public EmployeeServiceImpl() {
        
    }
    
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }
    

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    
    
    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();
    }
    
}
