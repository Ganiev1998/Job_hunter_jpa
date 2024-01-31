package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.PermissionDTO.PermissionDTO;
import example.job_hunter_jpa.dto.PermissionDTO.PermissionResDTO;
import example.job_hunter_jpa.entity.Permission;
import example.job_hunter_jpa.mapper.Mapper;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
public class PermissionMap implements Mapper<PermissionResDTO, Permission,PermissionDTO> {
    @Override
    public PermissionResDTO toDTO(Permission permission) {
        return PermissionResDTO.builder().id(permission.getId()).name(permission.getName())
                .build();
    }

    @Override
    public Permission toENT(PermissionDTO e) {
        return Permission.builder().name(e.getName()).build();
    }

    @Override
    public List<PermissionResDTO> toDTOs(List<Permission> permissions) {
        return permissions.stream().map(this::toDTO).collect(Collectors.toList());
    }
//    public Permission toENT(PermissionDTO e){
//        return Permission.builder().name(e.getName()).build();
//    }
}
