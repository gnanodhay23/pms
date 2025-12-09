package com.gnanu.quizapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gnanu.quizapp.Employee;
import com.gnanu.quizapp.repo.EmployeeRepositiry;

import jakarta.transaction.Transactional;

@Service
public class Empservice {

    private final EmployeeRepositiry empRepo;

    @Autowired
    public Empservice(EmployeeRepositiry empRepo) {
        this.empRepo = empRepo;
    }
    @Transactional
    public Employee getbyname(String name) {
        return empRepo.findByName(name);
    }
    
    @Transactional
    public Employee insertEmp(Employee x)
    {
 
    	return empRepo.save(x);
    }
}
