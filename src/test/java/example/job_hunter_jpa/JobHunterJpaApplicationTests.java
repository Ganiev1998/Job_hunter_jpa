package example.job_hunter_jpa;

import example.job_hunter_jpa.repository.PermissionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.security.Permission;
import java.util.Collections;
import java.util.List;

@SpringBootTest
class JobHunterJpaApplicationTests {
    private PermissionRepository repository;

    @Test
    void contextLoads() {
    }
    @Test
    @Transactional
    void testPer(){
        List<Permission> permission = Collections.singletonList((Permission) repository.findByName("create"));
        Assert.isTrue(!permission.isEmpty(),"yes empty");
    }

}
