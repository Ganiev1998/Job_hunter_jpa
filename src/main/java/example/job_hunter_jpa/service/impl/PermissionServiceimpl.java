package example.job_hunter_jpa.service.impl;

import example.job_hunter_jpa.dto.PermissionDTO.PermissionDTO;
import example.job_hunter_jpa.dto.userDTO.UserDTO;
import example.job_hunter_jpa.entity.Permission;
import example.job_hunter_jpa.mapper.impl.PermissionMap;
import example.job_hunter_jpa.repository.PermissionRepository;
import example.job_hunter_jpa.service.PermissionService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class PermissionServiceimpl implements PermissionService {
    private final PermissionMap mapper;
    private final PermissionRepository repository;
    @Override
    public PermissionDTO getById(Integer id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public List<PermissionDTO> getAll() {
        return mapper.toDTOs(repository.findAll());
    }

    @Override
    public PermissionDTO create(PermissionDTO permission) {
        return mapper.toDTO(repository.save(mapper.toENT(permission)));
    }

    @Override
    public PermissionDTO update(Integer id, PermissionDTO permission) {
        Permission permission1 = repository.getReferenceById(id);
        permission1.setName(permission.getName());
        return mapper.toDTO(repository.save(permission1));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
