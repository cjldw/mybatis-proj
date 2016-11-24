package com.superwen.mappers;

import com.superwen.query.BaseQuery;

import java.util.List;

/**
 * @description:
 * @author: luowen<bigpao.luo@gmail.com>
 * @time: 11/23/2016.
 */
public interface BaseMapper<T> {

    public abstract T findById(Integer id);

    public abstract Integer insert(T entity);

    public abstract Integer update(T entity);

    public abstract List<T> findByQuery(BaseQuery baseQuery);

    public abstract Integer deleteById(Integer id);

}
