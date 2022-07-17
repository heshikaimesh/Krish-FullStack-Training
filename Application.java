
import com.krishantha.training.salesmanager.config.ApplicationConfiguration;
import com.krishantha.training.salesmanager.model.Employee;
import com.krishantha.training.salesmanager.service.EmployeeService;
import com.krishantha.training.salesmanager.service.EmployeeServiceImpl;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahsika
 */
public class Application {
    public static void main(String[] args) {
        
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        
        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
        
        System.out.println(employeeService.toString());
        
        EmployeeService employeeService2 = applicationContext.getBean("employeeService", EmployeeService.class);
        
        System.out.println(employeeService2.toString());
        
        
        List<Employee> employees = employeeService.getAllEmployees();
        
        for(Employee employee: employees){
            System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation());
        }
    }
    
}
