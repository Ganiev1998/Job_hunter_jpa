package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.PermissionDTO.PermissionDTO;
import example.job_hunter_jpa.entity.Permission;
import example.job_hunter_jpa.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface PermissionMapper extends Mapper<PermissionDTO, Permission> {
}
