package com.bridgelabz.employee.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employee.dto.EmployeePayrollDTO;
import com.bridgelabz.employee.model.Employee;

@Service
public class EmployeePayrollService implements IEmployeePayrollService 
{

	@Override
	public List<Employee> getEmployeePayrollData() 
    {
		List<Employee> empDataList= new ArrayList<>();
        empDataList.add(new Employee(1,new EmployeePayrollDTO("Pankaj",3000)));
        return empDataList;
	}

	@Override
	public Employee getEmployeePayrollDataById(int empId) 
    {
		Employee empData=null;
        empData= new Employee(1,new EmployeePayrollDTO("Pankaj",30000));
		return empData;
	}

	@Override
	public Employee createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) 
    {

		Employee empData=null;
        empData= new Employee(1,employeePayrollDTO);
		return empData;
	}

	@Override
	public Employee updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) 
    {
		Employee empData=null;
        empData= new Employee(1,employeePayrollDTO);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) 
    {
		// TODO Auto-generated method stub

	}

}