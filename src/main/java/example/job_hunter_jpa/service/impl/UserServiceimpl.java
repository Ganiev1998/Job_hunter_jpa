package example.job_hunter_jpa.service.impl;

import example.job_hunter_jpa.dto.userDTO.UserDTO;
import example.job_hunter_jpa.dto.userDTO.UserResDTO;
import example.job_hunter_jpa.entity.Users;
import example.job_hunter_jpa.mapper.impl.RoleMap;
import example.job_hunter_jpa.mapper.impl.UserMap;
import example.job_hunter_jpa.repository.RoleRepository;
import example.job_hunter_jpa.repository.UserRepository;
import example.job_hunter_jpa.service.UserService;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Setter
@Getter
@Service
@RequiredArgsConstructor
public class UserServiceimpl implements UserService {
    private final UserRepository userRepository;
    private final UserMap userMapper;
    private final RoleRepository roleRepository;
    private final RoleMap roleMapper;
    @Override
    public UserResDTO getById(Integer id) {
        return userMapper.toDTO(userRepository.getReferenceById(id));
    }

    @Override
    public List<UserResDTO> getAll() {
        return userMapper.toDTOs(userRepository.findAll());
    }

    @Override
    @Transactional
    public UserResDTO create(UserDTO users) {
//        Users users1 = new Users();
//        users1.setUserName(users.getUserName());
//        users1.setPassword(users.getPassword());
//        users1.setRole(users.getRole());
        return userMapper.toDTO(userRepository.save(userMapper.toENT(users)));

    }

    @Override
    public UserResDTO update(Integer id, UserDTO users) {
        Users user = userRepository.getReferenceById(id);
        user.setUserName(users.getUserName());
        user.setPassword(users.getPassword());
        user.setRole(roleMapper.toENT(users.getRole()));
        return userMapper.toDTO(userRepository.save(user));
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
