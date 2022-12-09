package com.employee.app.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Employee getEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name=sc.nextLine();
		System.out.println("Enter Domain");
		String domain=sc.nextLine();
		System.out.println("Enter Doj");
		String doj=sc.nextLine();
		Employee emp=new Employee(id,name,domain,doj);
		return emp;
	}
	public static void print(Employee emp) {
		System.out.println("ID: "+emp.getId()+"\nName: "+emp.getName()
		+"\nDomain: "+emp.getDomain()+"\nDoj: "+emp.getDoj()+"\n\n");
		
		
	}
	public static void print(List<Employee> list) {
		for(Employee emp:list)
			print(emp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Employee> list=new ArrayList();
		Driver driver=new Driver();
		boolean loop=true;
		while(loop) {
			System.out.println("Select option\n 1) Insert\n 2) Update\n 3) Delete\n 4) Search\n 5) Show all\n 6) Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				Employee emp=getEmployee();
				driver.addEmployee(emp);
				break;
			}
			case 2:{
				System.out.println("Enter Employee id");
				Employee emp=driver.getEmployeeById(sc.nextInt());
				
				driver.updateEmployee(emp);				
				break;
			}
			case 3:{
				System.out.println("Enter Employee id");
				driver.deleteEmployeeById(sc.nextInt());
				break;
			}
			case 4:{
				System.out.println("Enter Employee id");
				Employee emp=driver.getEmployeeById(sc.nextInt());
				print(emp);
				break;
			}
			case 5:{
				list=driver.getAllEmployees();
				print(list);
				break;
			}
			case 6:{
				loop=false;
				break;
			}
			}
			
		}

	}

}
