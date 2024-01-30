package example.job_hunter_jpa.mapper.impl;

import example.job_hunter_jpa.dto.roleDTO.RoleDTO;
import example.job_hunter_jpa.dto.userDTO.UserDTO;
import example.job_hunter_jpa.dto.userDTO.UserResDTO;
import example.job_hunter_jpa.entity.Users;
import example.job_hunter_jpa.mapper.Mapper;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Component
public class UserMap implements Mapper<UserResDTO, Users> {
    private final RoleMap roleMapper;

    public Users toENT1(UserDTO e){
        return Users.builder().id(e.getId()).userName(e.getUserName()).password(e.getPassword())
                .role((e.getRole())).build();
    }
    @Override
    public UserResDTO toDTO(Users users) {
        return UserResDTO.builder().id(users.getId()).userName(users.getUserName())
                .password(users.getPassword()).roleResDTO(roleMapper.toDTO(users.getRole()))
                .build();
    }

    @Override
    public Users toENT(UserResDTO e) {
        return Users.builder().id(e.getId()).userName(e.getUserName()).password(e.getPassword())
                .role(roleMapper.toENT(e.getRoleResDTO())).build();
    }

    @Override
    public List<UserResDTO> toDTOs(List<Users> users) {
        return users.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
