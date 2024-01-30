package example.job_hunter_jpa.dto.roleDTO;

import example.job_hunter_jpa.dto.PermissionDTO.PermissionResDTO;
import example.job_hunter_jpa.entity.Permission;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoleResDTO {
    private Integer id;
    private String name;
    private Set<Permission> permission;
}
