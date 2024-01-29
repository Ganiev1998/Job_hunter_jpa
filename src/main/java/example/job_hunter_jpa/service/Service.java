package example.job_hunter_jpa.service;

import java.util.List;

public interface Service <A,B>{
    A getById(Integer id);
    List<A> getAll();
    A create(B b);
    A update(Integer id,B b);
    void delete(Integer id);
}
