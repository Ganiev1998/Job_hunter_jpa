package example.job_hunter_jpa.controller;

import example.job_hunter_jpa.dto.PermissionDTO.PermissionDTO;
import example.job_hunter_jpa.dto.PermissionDTO.PermissionResDTO;
import example.job_hunter_jpa.entity.Permission;
import example.job_hunter_jpa.entity.Role;
import example.job_hunter_jpa.service.PermissionService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/permission")
public class PermissionController {
    private final PermissionService service;
    @GetMapping
    public List<PermissionResDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public PermissionResDTO getById(@PathVariable Integer id){
        return service.getById(id);
    }
    @PostMapping
    public PermissionResDTO create(@RequestBody PermissionDTO permission){
        return service.create(permission);
    }
    @PutMapping("/{id}")
    public PermissionResDTO update(@PathVariable Integer id, @RequestBody PermissionDTO permission){
        return service.update(id,permission);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
