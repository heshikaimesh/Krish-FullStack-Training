/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krishantha.training.salesmanager.repository;

import com.krishantha.training.salesmanager.model.Employee;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahsika
 */
@Repository("you-can-use-anyname")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
    
    
    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<>();
        
        Employee employee = new Employee();
        employee.setEmployeeName("krishantha");
        employee.setEmployeeLocation("kadawatha");
        employees.add(employee);
        return employees;
    }
    
}
