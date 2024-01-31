package example.job_hunter_jpa.mapper;

import java.util.List;

public interface Mapper <D,E,R>{
    D toDTO(E e);
    E toENT(R e);
    List<D> toDTOs(List<E> es);
}
