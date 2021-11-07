package com.bridgelabz.employee.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.employee.model.Employee;


public interface EmployeePayrollRepository extends JpaRepository<Employee,Integer>
{
	

}