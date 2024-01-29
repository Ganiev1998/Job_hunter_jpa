package example.job_hunter_jpa.repository;

import example.job_hunter_jpa.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface PermissionRepository extends JpaRepository<Permission,Integer> {
}
