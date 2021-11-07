package com.bridgelabz.employee.model;
import java.time.LocalDate;
import java.util.List;

import com.bridgelabz.employee.dto.EmployeePayrollDTO;

import lombok.Data;

public @Data class Employee
{

    private int employeeId;
    private String name;
    private long salary;
	private String gender;
	private LocalDate startDate;
	private String note;
	private String profilePic;
	private List<String> department;

    public Employee()
    {

    }

	public Employee(int employeeId, EmployeePayrollDTO employeePayrollDTO) 
	{
		this.employeeId = employeeId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender=employeePayrollDTO.gender;
		this.startDate=employeePayrollDTO.startDate;
		this.note=employeePayrollDTO.note;
		this.profilePic=employeePayrollDTO.profilePic;
		this.department=employeePayrollDTO.department;
	}


	
	
    
}
