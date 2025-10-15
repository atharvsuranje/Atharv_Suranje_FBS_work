package controller.dao;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import controller.dao.filehandling.FileUtilities;
import model.*;

public class EmployeeDAO {
	private static ArrayList<Employee> empArr;
	
	static {
			empArr=FileUtilities.readFromFile("E://Firstbit Course//Core_Java_module//MyJavaWorkspace//My_2025_10_13 (EmployeeDAO in file Handling with ArrayList)//src//controller//dao//filehandling//empData.txt");
			if(empArr.isEmpty()) {
				empArr.add(new HR(104, "Priya", 46000, 4200));
				empArr.add(new HR(105, "Vikas", 49000, 4800));
				empArr.add(new HR(106, "Nisha", 51000, 5200));
				
				empArr.add(new SalesManager(204, "Rahul", 61000, 8500, 14));
				empArr.add(new SalesManager(205, "Tina", 59000, 7800, 13));
				empArr.add(new SalesManager(206, "Deepak", 63000, 9200, 11));
				
				empArr.add(new Admin(305, "Kavita", 69000, 9700));
				empArr.add(new Admin(306, "Manoj", 74000, 11500));
				empArr.add(new Admin(307, "Ritu", 71000, 10200));
				empArr.add(new Admin(308, "Arjun", 76000, 12500));			
			}
	}

	//Getters
	public static ArrayList<Employee> getEmpArr() {
		return empArr;
	}

	public boolean addEmployee(Employee e) {
		empArr.add(e);
		return true;
	}
	
	public void displayAllEmployee() {
		System.out.println(empArr);
	}
	
	public Employee searchEmployeeById(int id) {
		for(Employee employee:empArr) {
			if(employee.getId() == id) return employee;
		}
		return null;
	}
	
	public boolean updateEmployee(int id, double salary) {
		Employee employee=searchEmployeeById(id);
		if(employee != null) {
			employee.setSalary(salary);
			return true;
		}
		return false;
		
	}
	
	public boolean deleteEmployee(int id) {
		Employee employee=searchEmployeeById(id);
		if(employee != null) {
			empArr.remove(employee);
			return true;
		}
		return false;
	}
	
	public double calculateSalary(Employee employee) {
		return employee.calculateSalary();
	}
}





















