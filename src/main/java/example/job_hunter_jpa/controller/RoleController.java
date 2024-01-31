package example.job_hunter_jpa.controller;

import example.job_hunter_jpa.dto.roleDTO.RoleDTO;
import example.job_hunter_jpa.dto.roleDTO.RoleResDTO;
import example.job_hunter_jpa.entity.Role;
import example.job_hunter_jpa.service.RoleService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/role")
public class RoleController {
    private final RoleService service;
    @GetMapping("/{id}")
    public RoleResDTO getById(@PathVariable Integer id){
        return service.getById(id);
    }
    @GetMapping
    public List<RoleResDTO> getAll(){
        return service.getAll();
    }
    @PostMapping
    public RoleResDTO create(@RequestBody RoleDTO role){
        return service.create(role);
    }
    @PutMapping("/{id}")
    public RoleResDTO update(@PathVariable Integer id,@RequestBody RoleDTO role){
        return service.update(id,role);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
