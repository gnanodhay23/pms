package com.gnanu.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gnanu.quizapp.Employee;
import com.gnanu.quizapp.service.Empservice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;


@RestController
@RequestMapping("/api")
public class dashboardcontroller {

    private final Empservice empService;

    @Autowired
    public dashboardcontroller(Empservice empService) {
        this.empService = empService;
    }

    @GetMapping("/g")
    public String root() {
        return "Hello Gnanu!";
    }
    @PostMapping("/insertdetails")
    @Operation(summary = "Insert a new employee record")
    @ApiResponse(responseCode = "200", description = "Employee inserted successfully")
    public Employee insertDetails(@RequestBody Employee x)
    {
    	System.out.println("name : "+x.getName());
    	return empService.insertEmp(x);
    }
    @GetMapping("/getdetails")
    public Employee getDetails(@RequestParam String name) {
        return empService.getbyname(name);
    }
}
