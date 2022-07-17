/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krishantha.training.salesmanager.config;


import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Ahsika
 */
@Configuration
@ComponentScan("com.krishantha")
public class ApplicationConfiguration {
    
    @Bean(name = "employeeService")
    @Scope("prototype")
    public EmployeeService getEmployeeService(){
        
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        return employeeService;
    }
    /*
    @Bean(name = "employeeRepository")
    public EmployeeRepository getEmployeeRepository(){
        return new HibernateEmployeeRepositoryImpl();
    }
    */
}
