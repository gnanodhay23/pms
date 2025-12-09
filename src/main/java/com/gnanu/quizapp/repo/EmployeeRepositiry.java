
package com.gnanu.quizapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gnanu.quizapp.Employee;
@Repository
public interface EmployeeRepositiry extends JpaRepository<Employee, Long> {
    Employee findByName(String name);

	
}
