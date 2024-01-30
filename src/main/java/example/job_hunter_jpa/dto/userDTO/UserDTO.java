package example.job_hunter_jpa.dto.userDTO;

import example.job_hunter_jpa.dto.roleDTO.RoleDTO;
import example.job_hunter_jpa.entity.Role;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String userName;
    private String password;
    private Role role;
}
