package com.getsession;

import java.util.ArrayList;
import java.util.Scanner;



import com.testModel.Employee;
import com.testhiber.HibernateCrud.EmployeeProvider;

public class EmployeeController {

	public static void addData() {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		//System.out.println("enter the employee id:");employee.setId(sc.nextInt());
		System.out.println("enter  the employee name:");employee.setName(sc.next());
		System.out.println("enter the employee salary:");employee.setSal(sc.nextFloat());
		EmployeeProvider employeeProvider=new EmployeeProvider();
		employeeProvider.addEmpployee(employee);
	}
	public static void displayData() {
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("enter the employee id:");employee.setId(sc.nextInt());
		EmployeeProvider employeeProvider=new EmployeeProvider();
		 Employee e=employeeProvider.displayEmployee(employee);
		 System.out.println("name:"+e.getName()+"  salary:"+e.getSal());
		
	}
	public static void deleteData() 
	{
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.println("enter the employee id:");employee.setId(sc.nextInt());
		EmployeeProvider employeeProvider=new EmployeeProvider();
		employeeProvider.deleteEmployee(employee);
	}
	
	public static void main(String[] args) {
		addData();
		
		//displayData();
//        deleteData();
        
	}

}
