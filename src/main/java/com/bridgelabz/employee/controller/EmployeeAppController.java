package com.bridgelabz.employee.controller;


import com.bridgelabz.employee.dto.EmployeePayrollDTO;
import com.bridgelabz.employee.dto.ResponseDTO;
import com.bridgelabz.employee.model.Employee;
import com.bridgelabz.employee.services.IEmployeePayrollService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeAppController 
{
    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData()
    {
        List<Employee> empDataList=null;
        empDataList=employeePayrollService.getEmployeePayrollData();
        ResponseDTO respDTO = new ResponseDTO("Get call Succesfull", empDataList);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId)
    {
    	Employee empData=null;
        empData=employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDTO respDTO = new ResponseDTO("Get call For ID Succesfull", empData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO)
    {

    	Employee empData=null;
        empData= employeePayrollService.createEmployeePayrollData(employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created payroll data successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
	
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO)
    {

    	Employee empData=null;
        empData= employeePayrollService.updateEmployeePayrollData(employeePayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created payroll data successfully", empData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
   
    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId)
    {
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDTO respDTO = new ResponseDTO("Deleted successfuly","Deleted id: "+empId);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
}