package example.job_hunter_jpa.mapper;

import java.util.List;

public interface Mapper <D,E>{
    D toDTO(E e);
    E toENT(D e);
    List<D> toDTOs(List<E> es);
}
