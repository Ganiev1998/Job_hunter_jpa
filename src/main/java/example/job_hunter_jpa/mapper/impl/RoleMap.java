package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.roleDTO.RoleDTO;
import example.job_hunter_jpa.dto.roleDTO.RoleResDTO;
import example.job_hunter_jpa.entity.Role;
import example.job_hunter_jpa.mapper.Mapper;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
@Data
public class RoleMap implements Mapper<RoleResDTO,Role,RoleDTO> {
    @Override
    public RoleResDTO toDTO(Role role) {
        return RoleResDTO.builder().id(role.getId()).name(role.getName()).permission(role.getPermissions()).build();
    }

    @Override
    public Role toENT(RoleDTO e) {
        return null;
    }

    @Override
    public List<RoleResDTO> toDTOs(List<Role> roles) {
        return roles.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
