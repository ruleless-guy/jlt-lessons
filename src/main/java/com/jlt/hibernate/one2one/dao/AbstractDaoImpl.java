package com.jlt.hibernate.one2one.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jlt.hibernate.one2one.HiberanteUtils;

public abstract class AbstractDaoImpl<T, ID extends Comparable<ID>> implements AbstractDao<T, ID> {
	private Session session = null;
	private Transaction transaction = null;
	private Class<T> entityClass = null;
	
	@SuppressWarnings("unchecked")
	public AbstractDaoImpl() {
		entityClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	private void startOperation() {
		session = HiberanteUtils.getSessionFactory().openSession();
		transaction = session.beginTransaction();
	}

	@Override
	public boolean save(T entity) {
		boolean success = false;
		try {
			startOperation();
			session.save(entity);
			transaction.commit();
			success = true;
		}catch(HibernateException hibernateException) {
			transaction.rollback();
			success = false;
		}finally {
			session.close();
		}
		return success;
	}
	
	

	@Override
	public T findOne(ID id) {
		T entity = null;
		try {
			startOperation();
			entity = session.get(entityClass, id);
			transaction.commit();
		}catch (HibernateException e) {
			transaction.rollback();
		}finally {
			session.close();
		}
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		List<T> data = null;
		try {
			startOperation();
			TypedQuery<T> typedQuery = session.createQuery("from "+entityClass.getName());
			data = typedQuery.getResultList();
		}catch(HibernateException hibernateException) {
			transaction.rollback();
		}finally {
			session.close();
		}
		return data;
	}

	@Override
	public boolean update(T entity) {
		boolean updated = false;
		try {
			startOperation();
			session.merge(entity);
			transaction.commit();
			updated = true;
		}catch(HibernateException hibernateException) {
			transaction.rollback();
			updated = false;
		}finally {
			session.close();
		}
		return updated;
	}

	@Override
	public boolean delete(T entity) {
		boolean deleted = false;
		try {
			startOperation();
			session.delete(entity);
			transaction.commit();
			deleted = true;
		}catch(HibernateException hibernateException) {
			transaction.rollback();
			deleted = false;
		}
		return deleted;
	}

	@Override
	public boolean deleteById(ID id) {
		T t = findOne(id);
		return delete(t);
	}
	
	
	
}
