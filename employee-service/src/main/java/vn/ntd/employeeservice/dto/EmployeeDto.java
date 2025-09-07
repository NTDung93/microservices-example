package vn.ntd.employeeservice.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "Employee DTO")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class  EmployeeDto {
    private Long id;

    @Schema(description = "First Name")
    private String firstName;
    private String lastName;
    private String email;
    private String departmentCode;
    private String organizationCode;
}
