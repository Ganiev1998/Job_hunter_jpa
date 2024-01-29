package example.job_hunter_jpa.dto.roleDTO;

import example.job_hunter_jpa.dto.PermissionDTO.PermissionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleDTO {
    private Integer id;
    private String name;
    private PermissionDTO permissionDTO;
}
