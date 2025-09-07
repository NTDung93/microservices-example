package vn.ntd.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.ntd.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
