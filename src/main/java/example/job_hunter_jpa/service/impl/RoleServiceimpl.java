package example.job_hunter_jpa.service.impl;

import example.job_hunter_jpa.dto.roleDTO.RoleDTO;
import example.job_hunter_jpa.dto.roleDTO.RoleResDTO;
import example.job_hunter_jpa.entity.Role;
import example.job_hunter_jpa.mapper.impl.PermissionMapper;
import example.job_hunter_jpa.mapper.impl.RoleMapper;
import example.job_hunter_jpa.mapper.impl.RoleResMapper;
import example.job_hunter_jpa.repository.PermissionRepository;
import example.job_hunter_jpa.repository.RoleRepository;
import example.job_hunter_jpa.service.RoleService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class RoleServiceimpl implements RoleService {
    private final RoleRepository repository;
    private final RoleResMapper mapper;
    private final PermissionRepository p_repository;
    private final PermissionMapper p_mapper;
    @Override
    public RoleResDTO getById(Integer id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<RoleResDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public RoleResDTO create(Role role) {
        return mapper.toDTO(repository.save(role));
    }

    @Override
    public RoleResDTO update(Integer id, Role role) {
        Role role1 = repository.getReferenceById(id);
        role1.setName(role.getName());
        role1.setPermissions(role.getPermissions());
        return mapper.toDTO(repository.save(role1));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
