package com.bridgelabz.employee.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import com.bridgelabz.employee.dto.EmployeePayrollDTO;
import com.bridgelabz.employee.exception.EmployeePayrollException;
import com.bridgelabz.employee.model.Employee;
import com.bridgelabz.employee.repository.EmployeePayrollRepository;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService 
{

	@Autowired
	private EmployeePayrollRepository employeePayrollRepository;

	@Override
	public List<Employee> getEmployeePayrollData() 
	{
		return employeePayrollRepository.findAll();
	}

	@Override
	public Employee getEmployeePayrollDataById(int empId) 
	{
		return  employeePayrollRepository
				.findById(empId)
				.orElseThrow(()->new EmployeePayrollException("Employee with employee id "+empId+"does not exists..!"));
	}

	@Override
	public Employee createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) 
	{

		Employee empData=null;
		empData= new Employee(employeePayrollDTO);
		log.debug("Emp data :"+empData.toString());
		return employeePayrollRepository.save(empData);
	}

	@Override
	public Employee updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO) 
	{
		Employee empData=this.getEmployeePayrollDataById(empId);
		empData.updateEmployeePayrollData(employeePayrollDTO);
		return employeePayrollRepository.save(empData);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) 
	{
		Employee empData=this.getEmployeePayrollDataById(empId);
		employeePayrollRepository.delete(empData);

	}
	@Override
	public List<Employee> getEmployeeByDepartment(String department)
	{
		return employeePayrollRepository.findEmployeeDepartment(department);
	}

}