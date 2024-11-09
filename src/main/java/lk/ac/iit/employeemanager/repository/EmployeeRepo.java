package lk.ac.iit.employeemanager.repository;

import lk.ac.iit.employeemanager.module.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
