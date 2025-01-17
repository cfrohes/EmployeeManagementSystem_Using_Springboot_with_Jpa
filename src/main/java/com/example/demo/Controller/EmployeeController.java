package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/e/create")
	public Employee newEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}
	
	@GetMapping("/e/readById/{id}")
	public Employee fetchEmployee(@PathVariable int id) {
		return service.readEmployeeById(id);
	}
	
	@GetMapping("/e/all")
	public List<Employee> fetchAllEmployee() {
		return service.readEmployee();
	}
	@PutMapping("/e/update")
	public Employee updateEmp(@RequestBody Employee e) {
		return service.updateEmployee(e);
	}
	@DeleteMapping("/e/delete/{id}")
	public String deleteEmp(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
	
}
