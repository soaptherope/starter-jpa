package org.andersen.starter;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaseService<T extends BaseEntity> {

    private final BaseRepository<T> baseRepository;

    public BaseService(BaseRepository<T> baseRepository) {
        this.baseRepository = baseRepository;
    }

    public T save(T entity) {
        return baseRepository.save(entity);
    }

    public Optional<T> findById(Long id) {
        return baseRepository.findById(id);
    }

    public void delete(Long id) {
        baseRepository.deleteById(id);
    }

    public Iterable<T> findAll() {
        return baseRepository.findAll();
    }
}
