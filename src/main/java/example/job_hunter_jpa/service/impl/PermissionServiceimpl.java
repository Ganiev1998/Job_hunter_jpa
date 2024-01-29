package example.job_hunter_jpa.service.impl;

import example.job_hunter_jpa.dto.PermissionDTO.PermissionDTO;
import example.job_hunter_jpa.entity.Permission;
import example.job_hunter_jpa.mapper.impl.PermissionMapper;
import example.job_hunter_jpa.repository.PermissionRepository;
import example.job_hunter_jpa.service.PermissionService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class PermissionServiceimpl implements PermissionService {
    private final PermissionMapper mapper;
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
    public PermissionDTO create(Permission permission) {
        return mapper.toDTO(repository.save(permission));
    }

    @Override
    public PermissionDTO update(Integer id, Permission permission) {
        Permission permission1 = repository.getReferenceById(id);
        permission1.setName(permission.getName());
        return mapper.toDTO(repository.save(permission1));
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
