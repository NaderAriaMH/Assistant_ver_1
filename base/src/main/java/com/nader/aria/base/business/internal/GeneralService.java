package com.nader.aria.base.business.internal;

import com.nader.aria.base.entities.abstracts.BaseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface GeneralService<E extends BaseEntity> {

    public default void save(E baseEntity){}
    public default void save(List<E>baseEntities){}
    public default void update(E baseEntity){}
    public default void update(List<E> baseEntity){}
    public default void delete(Long id){}
    public default void delete(E baseEntity){}
    public default void delete(List<E> baseEntities){}
    public default Optional<E> findBy(Long id){ return Optional.empty(); }
    public default Optional<E> findBy(){ return Optional.empty(); }
    public default Optional<List<E>> findAll(){ return Optional.empty(); }
    public default Optional<List<E>> findAll(String queryName, Map<String,Object> params){ return Optional.empty(); }

}
