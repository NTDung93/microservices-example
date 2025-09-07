package vn.ntd.departmentservice.mapper;

import vn.ntd.departmentservice.dto.DepartmentDto;
import vn.ntd.departmentservice.entity.Department;

public class DepartmentMapper {

    private DepartmentMapper() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static DepartmentDto mapToDepartmentDto(Department department){
        return new DepartmentDto(
                department.getId(),
                department.getDepartmentName(),
                department.getDepartmentDescription(),
                department.getDepartmentCode()
        );
    }

    public static Department mapToDepartment(DepartmentDto departmentDto){
        return new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode()
        );
    }
}
