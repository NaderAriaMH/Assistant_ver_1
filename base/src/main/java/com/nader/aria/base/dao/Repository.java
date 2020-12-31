package com.nader.aria.base.dao;

import com.nader.aria.base.entities.abstracts.BaseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Repository<E extends BaseEntity> {

    public void save(E entity);
    public void save(List<E>entities);
    public void update(E entity);
    public void update(List<E> entities);
    public boolean delete(Long id);
    public boolean delete(E entity);
    public boolean delete(List<E> entities);
    public Optional<E> selectSingle(Long id);
    public Optional<E> selectSingle(String query, Map<String,Object> params);
    public Optional<List<E>> selectAll();
    public Optional<List<E>> selectAll(String query, Map<String,Object> params);


}
