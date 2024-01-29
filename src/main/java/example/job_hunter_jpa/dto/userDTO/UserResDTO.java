package example.job_hunter_jpa.dto.userDTO;

import example.job_hunter_jpa.dto.roleDTO.RoleResDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResDTO {
    private Integer id;
    private String userName;
    private String password;
    private RoleResDTO roleResDTO;
}
