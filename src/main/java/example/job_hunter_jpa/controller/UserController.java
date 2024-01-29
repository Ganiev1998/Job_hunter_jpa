package example.job_hunter_jpa.controller;

import example.job_hunter_jpa.dto.userDTO.UserResDTO;
import example.job_hunter_jpa.entity.Users;
import example.job_hunter_jpa.service.UserService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
@RequestMapping("/user")
public class UserController {
    private final UserService service;
    @GetMapping
    public List<UserResDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public UserResDTO getById(@PathVariable Integer id){
        return service.getById(id);
    }
    @PostMapping
    public UserResDTO create(@RequestBody Users user){
        return service.create(user);
    }
    @PutMapping("/{id}")
    public UserResDTO update(@PathVariable Integer id,@RequestBody Users user){
        return service.update(id,user);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
        System.out.println("object is deleted");
    }
}
