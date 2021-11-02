package com.bridgelabz.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employee.model.Employee;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeAppController 
{
    @RequestMapping(value = {"","/","/home"})
    public String sayHello()
    {
        return "Hello from bridgelabz!";
    }

    @RequestMapping(value="/query", method=RequestMethod.GET)
    public String sayHello(@RequestParam(value="name") String name) 
    {
        return "Hello "+name+"!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name)
    {
        return "Hello "+name+"!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody Employee employee)
    {

        return "Hello "+employee.getFirstName()+" "+employee.getLastName();
    }
	
    @PutMapping("put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value="lastName") String lastName) {
        
        return "Hello "+firstName+" "+lastName+"!";
    }

}