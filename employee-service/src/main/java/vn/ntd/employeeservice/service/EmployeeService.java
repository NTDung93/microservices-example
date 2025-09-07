package vn.ntd.employeeservice.service;

import vn.ntd.employeeservice.dto.APIResponseDto;
import vn.ntd.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}
