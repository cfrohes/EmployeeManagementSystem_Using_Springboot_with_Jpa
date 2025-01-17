package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
@Service
public class EmployeeService {
	
	EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	//create Employee
	public  Employee createEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	//Read Employee
	public List<Employee> readEmployee() {
		return employeeRepository.findAll();
	}
	
	//Read Employee By Id
	
	public Employee readEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	//Update Employee
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	//Delete Employee
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Delete SuccessFul Ho GAYA";
	}
}
