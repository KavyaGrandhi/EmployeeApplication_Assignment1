package com.organization.EmployeeApplication.Service;

import com.organization.EmployeeApplication.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employeeList=new ArrayList<>();
    @Override
    public Employee addEmployee(Employee e) {
        employeeList.add(e);
        return e;
    }

    @Override
    public Employee fetchEmployeeById(int id) {
        Employee emp=employeeList.stream().filter(employee -> employee.getId()==id).findFirst().get();
        return emp;
    }

    @Override
    public List<Employee> getAllEmployeeList() {
        return employeeList;
    }

    @Override
    public String deleteEmployeeById(int id) {
        Employee emp=employeeList.stream().filter(employee -> employee.getId()==id).findFirst().get();
         employeeList.remove(emp);
        return "Employee id : "+id+" removed successfully";
    }

    @Override
    public Employee updateEmployee(int id, Employee emp) {
        Employee e=employeeList.stream().filter(employee -> employee.getId()==id).findFirst().get();
        employeeList.remove(e);
        e.setId(emp.getId());
        e.setName(emp.getName());
        e.setDepartmentName(emp.getDepartmentName());
        e.setSalary(emp.getSalary());
        e.setEmailId(emp.getEmailId());
        employeeList.add(e);
        return e;
    }
}
