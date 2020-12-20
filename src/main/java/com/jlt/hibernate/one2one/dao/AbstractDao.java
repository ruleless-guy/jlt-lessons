package com.jlt.hibernate.one2one.dao;

import java.util.List;

public interface AbstractDao<T, ID extends Comparable<ID>> {
	boolean save(T entity);
	boolean update(T entity);
	boolean delete(T entity);
	boolean deleteById(ID id);
	T findOne(ID id);
	List<T> findAll();
}
