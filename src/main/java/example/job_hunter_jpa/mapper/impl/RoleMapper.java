package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.roleDTO.RoleDTO;
import example.job_hunter_jpa.entity.Role;
import example.job_hunter_jpa.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface RoleMapper extends Mapper<RoleDTO, Role> {
}
