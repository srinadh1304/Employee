package com.bridgelabz.employee.services;

import java.util.List;

import com.bridgelabz.employee.dto.EmployeePayrollDTO;
import com.bridgelabz.employee.model.Employee;

public interface IEmployeePayrollService 
{

    List<Employee> getEmployeePayrollData();
    Employee getEmployeePayrollDataById(int empId);
    Employee createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
    Employee updateEmployeePayrollData(int empId,EmployeePayrollDTO employeePayrollDTO);
    void deleteEmployeePayrollData(int empId);
    List<Employee> getEmployeeByDepartment(String department);
}