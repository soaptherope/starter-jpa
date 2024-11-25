package org.andersen.starter;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {

    protected final BaseRepository<T> baseRepository;

    public BaseServiceImpl(BaseRepository<T> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public T save(T entity) {
        return baseRepository.save(entity);
    }

    @Override
    public Optional<T> getById(Long id) {
        return baseRepository.findById(id);
    }

    @Override
    public List<T> getAll() {
        return baseRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        baseRepository.deleteById(id);
    }

    @Override
    public List<T> getAllSorted(Sort sort) {
        return baseRepository.findAll(sort);
    }
}
