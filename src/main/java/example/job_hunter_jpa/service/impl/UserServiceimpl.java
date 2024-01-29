package example.job_hunter_jpa.service.impl;

import example.job_hunter_jpa.dto.userDTO.UserDTO;
import example.job_hunter_jpa.dto.userDTO.UserResDTO;
import example.job_hunter_jpa.entity.Users;
import example.job_hunter_jpa.mapper.impl.RoleMapper;
import example.job_hunter_jpa.mapper.impl.UserMapper;
import example.job_hunter_jpa.mapper.impl.UserResMapper;
import example.job_hunter_jpa.repository.RoleRepository;
import example.job_hunter_jpa.repository.UserRepository;
import example.job_hunter_jpa.service.UserService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class UserServiceimpl implements UserService {
    private UserRepository userRepository;
    private UserResMapper userMapper;
    private RoleRepository roleRepository;
    private RoleMapper roleMapper;
    @Override
    public UserResDTO getById(Integer id) {
        return userMapper.toDTO(userRepository.getReferenceById(id));
    }

    @Override
    public List<UserResDTO> getAll() {
        return userMapper.toDTOs(userRepository.findAll());
    }

    @Override
    public UserResDTO create(Users users) {
        return userMapper.toDTO(userRepository.save(users));
    }

    @Override
    public UserResDTO update(Integer id, Users users) {
        Users user = userRepository.getReferenceById(id);
        user.setUserName(users.getUserName());
        user.setPassword(users.getPassword());
        user.setRole_id(users.getRole_id());
        return userMapper.toDTO(userRepository.save(user));
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
