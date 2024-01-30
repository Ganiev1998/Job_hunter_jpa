package example.job_hunter_jpa.repository;

import example.job_hunter_jpa.dto.userDTO.UserDTO;
import example.job_hunter_jpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
}
