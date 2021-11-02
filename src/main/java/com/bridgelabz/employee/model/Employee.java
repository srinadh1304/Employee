package com.bridgelabz.employee.model;

import com.bridgelabz.employee.dto.EmployeePayrollDTO;

public class Employee 
{
	 private int employeeId;
	    private String name;
	    private long salary;

	    public Employee()
	    {

	    }

		public Employee(int employeeId, EmployeePayrollDTO employeePayrollDTO) 
		{
			this.employeeId = employeeId;
			this.name = employeePayrollDTO.name;
			this.salary = employeePayrollDTO.salary;
		}

		public int getEmployeeId() 
		{
			return employeeId;
		}

		public void setEmployeeId(int employeeId) 
		{
			this.employeeId = employeeId;
		}

		public String getName() 
		{
			return name;
		}

		public void setName(String name) 
		{
			this.name = name;
		}

		public long getSalary() 
		{
			return salary;
		}

		public void setSalary(long salary) 
		{
			this.salary = salary;
		}
}