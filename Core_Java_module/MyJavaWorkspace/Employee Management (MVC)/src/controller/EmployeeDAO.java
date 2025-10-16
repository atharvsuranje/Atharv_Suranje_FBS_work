package controller;

import java.util.ArrayList;
import model.Employee;

public interface EmployeeDAO {
	public abstract ArrayList<Employee> getEmpArr();
	public abstract boolean addEmployee(Employee e);
	public abstract void displayAllEmployee();
	public abstract Employee searchEmployeeById(int id);
	public abstract boolean updateEmployee(int id, double salary);
	public abstract boolean deleteEmployee(int id);
	public abstract double calculateSalary(Employee employee);
}
