package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.roleDTO.RoleResDTO;
import example.job_hunter_jpa.entity.Role;
import example.job_hunter_jpa.mapper.Mapper;
@org.mapstruct.Mapper(componentModel = "spring")
public interface RoleResMapper extends Mapper<RoleResDTO, Role> {
}
