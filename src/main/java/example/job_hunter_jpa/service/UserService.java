package example.job_hunter_jpa.service;

import example.job_hunter_jpa.dto.userDTO.UserDTO;
import example.job_hunter_jpa.dto.userDTO.UserResDTO;
import example.job_hunter_jpa.entity.Users;

public interface UserService extends Service<UserResDTO, UserDTO> {
}
