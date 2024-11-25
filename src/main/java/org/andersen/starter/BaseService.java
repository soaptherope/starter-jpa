package org.andersen.starter;

import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface BaseService<T extends BaseEntity> {

    T save(T entity);

    Optional<T> getById(Long id);

    List<T> getAll();

    void delete(Long id);

    List<T> getAllSorted(Sort sort);
}
