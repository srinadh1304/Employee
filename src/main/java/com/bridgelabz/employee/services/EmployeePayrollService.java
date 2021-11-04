package com.bridgelabz.employee.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employee.dto.EmployeePayrollDTO;
import com.bridgelabz.employee.exception.EmployeePayrollException;
import com.bridgelabz.employee.model.Employee;

@Service
public class EmployeePayrollService implements IEmployeePayrollService 
{
	private List<Employee> employeePayrollList= new ArrayList<>();
	@Override
	public List<Employee> getEmployeePayrollData() 
    {
        return employeePayrollList;
	}

	@Override
	public Employee getEmployeePayrollDataById(int empId) 
    {
		return employeePayrollList.stream()
				   .filter(empData->empData.getEmployeeId()==empId)
				   .findFirst()
				   .orElseThrow(()->new EmployeePayrollException("Employee not found"));
	}

	@Override
	public Employee createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) 
    {
		
		Employee empData=null;
        empData= new Employee(employeePayrollList.size()+1,employeePayrollDTO);
        employeePayrollList.add(empData);
		return empData;
	}

	@Override
	public Employee updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO) 
    {
		Employee empData=this.getEmployeePayrollDataById(empId);
        empData.setName(employeePayrollDTO.name);
        empData.setSalary(employeePayrollDTO.salary);
        employeePayrollList.set(empId-1,empData);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) 
    {
		employeePayrollList.remove(empId-1);
		
	}


}