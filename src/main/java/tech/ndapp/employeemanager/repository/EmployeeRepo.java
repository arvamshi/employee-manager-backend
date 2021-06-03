package tech.ndapp.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ndapp.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
