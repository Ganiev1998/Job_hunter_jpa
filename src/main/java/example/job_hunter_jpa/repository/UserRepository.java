package example.job_hunter_jpa.repository;

import example.job_hunter_jpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
