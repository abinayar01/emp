package com.employee.app.dao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.employee.app.dao.Employee;
public class Driver implements EmployeeService{
	List<Employee> list;
	Scanner sc=new Scanner(System.in);
	public Driver() {
		list=new ArrayList();
	}
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list.add(employee);
		
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		for(Employee emp:list) {
			if(emp.getId()==employeeId) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Enter Name");
		employee.setName(sc.nextLine());
		System.out.println("Enter Domain");
		employee.setDomain(sc.nextLine());
		System.out.println("Enter Doj");
		employee.setDoj(sc.nextLine());		
		
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		for(Employee emp:list) {
			if(emp.getId()==employeeId) {
				list.remove(emp);
			}
		}
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		if(list.size()>0)
			return list;
		return null;
	}

}
