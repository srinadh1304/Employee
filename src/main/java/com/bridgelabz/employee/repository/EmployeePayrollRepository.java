package com.bridgelabz.employee.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bridgelabz.employee.model.Employee;


public interface EmployeePayrollRepository extends JpaRepository<Employee,Integer>
{
	 @Query(value = "select * from employee_payroll ,employee_department where employee_id=id and department=:department",nativeQuery = true)
	    List<Employee> findEmployeeDepartment(String department);

}