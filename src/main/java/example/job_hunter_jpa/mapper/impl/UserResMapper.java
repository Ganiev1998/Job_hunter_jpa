package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.userDTO.UserResDTO;
import example.job_hunter_jpa.entity.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserResMapper extends example.job_hunter_jpa.mapper.Mapper<UserResDTO, Users> {
}
