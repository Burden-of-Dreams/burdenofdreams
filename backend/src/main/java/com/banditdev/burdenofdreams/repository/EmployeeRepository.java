package com.banditdev.burdenofdreams.repository;

import com.banditdev.burdenofdreams.model.user.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
