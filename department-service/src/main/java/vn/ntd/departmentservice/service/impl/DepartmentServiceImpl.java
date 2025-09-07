package vn.ntd.departmentservice.service.impl;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import vn.ntd.departmentservice.dto.DepartmentDto;
import vn.ntd.departmentservice.entity.Department;
import vn.ntd.departmentservice.mapper.DepartmentMapper;
import vn.ntd.departmentservice.repository.DepartmentRepository;
import vn.ntd.departmentservice.service.DepartmentService;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

        // convert department dto to department jpa entity
        Department department = DepartmentMapper.mapToDepartment(departmentDto);

        Department savedDepartment = departmentRepository.save(department);

        DepartmentDto savedDepartmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);

        return savedDepartmentDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String departmentCode) {

        Department department = departmentRepository.findByDepartmentCode(departmentCode);

        DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);

        return departmentDto;
    }
}
