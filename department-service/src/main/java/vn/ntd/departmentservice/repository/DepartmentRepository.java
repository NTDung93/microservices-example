package vn.ntd.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.ntd.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
