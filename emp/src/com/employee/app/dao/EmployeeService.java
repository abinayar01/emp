package com.employee.app.dao;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    Employee getEmployeeById(Integer employeeId);
    void updateEmployee(Employee employee);
    void deleteEmployeeById(Integer employeeId);
    List<Employee> getAllEmployees();
}
