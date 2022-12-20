package com.organization.EmployeeApplication.Controller;

import com.organization.EmployeeApplication.Model.Employee;
import com.organization.EmployeeApplication.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee e){
        return employeeService.addEmployee(e);
    }

    @GetMapping
    public List<Employee> getAllEmployeeList(){
        return employeeService.getAllEmployeeList();
    }

    @GetMapping("/{id}")
    public Employee fetchEmployeeById(@PathVariable int id){
        return employeeService.fetchEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee emp){
        return employeeService.updateEmployee(id,emp);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable int id){
        return employeeService.deleteEmployeeById(id);
    }

}
