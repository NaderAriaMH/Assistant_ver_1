package com.nader.aria.base.dao;

import com.nader.aria.base.entities.abstracts.BaseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public abstract class RepositoryImpl<E extends BaseEntity> implements Repository<E>{


    @Override
    public void save(E entity) {
        //TODO complete save entity
    }

    @Override
    public void save(List<E> entities) {
        //TODO complete save all records
    }

    @Override
    public void update(E entity) {
        //TODO complete update entity
    }

    @Override
    public void update(List<E> entities) {
        //TODO complete update all records
    }

    @Override
    public boolean delete(Long id){
        return false;//TODO complete delete by id
    }

    @Override
    public boolean delete(E entity) {
        return false;//TODO complete delete by entity
    }

    @Override
    public boolean delete(List<E> entities) {
        return false;//TODO complete delete all records
    }

    @Override
    public Optional<E> selectSingle(Long id) {
        return Optional.empty();//TODO complete selectSingle by id
    }

    @Override
    public Optional<E> selectSingle(String query, Map<String, Object> params) {
        return Optional.empty();//TODO complete selectSingle by params
    }

    @Override
    public Optional<List<E>> selectAll() {
        return Optional.empty();//TODO complete selectAll recodes
    }

    @Override
    public Optional<List<E>> selectAll(String query, Map<String, Object> params) {
        return Optional.empty();//TODO complete selectAll by Params
    }
}
