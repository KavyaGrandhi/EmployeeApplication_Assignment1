package com.organization.EmployeeApplication.Service;

import com.organization.EmployeeApplication.Model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee( Employee e);

   public Employee fetchEmployeeById(int id);

    List<Employee> getAllEmployeeList();

    String deleteEmployeeById(int id);

    Employee updateEmployee(int id, Employee emp);
}
