package com.sample.crud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.crud.Dao.EmployeeDao;
import com.sample.crud.Entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao employeedao;
	public Employee saveEmployee(Employee employee) {
		return employeedao.save(employee);
	}
	public List<Employee> getEmployees() {
		List<Employee> employees=new ArrayList<>();
		employeedao.findAll().forEach(employees::add);
		return employees;
	}
    public Employee getEmployees(Integer employeeId) {
    	return employeedao.findById(employeeId).orElseThrow();
    }
    public void deleteEmployee(Integer employeeId) {
    	employeedao.deleteById(employeeId);
    }
    public Employee updateEmployee(Employee employee)
    {
    	employeedao.findById(employee.getEmployeeId()).orElseThrow();
    	return employeedao.save(employee);
    }
}
