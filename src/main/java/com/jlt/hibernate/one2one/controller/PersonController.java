package com.jlt.hibernate.one2one.controller;

import java.util.List;

import com.jlt.hibernate.one2one.entity.Person;
import com.jlt.hibernate.one2one.view.AbstractView;

public interface PersonController extends AbstractView<Person>{
	Person findById(Long id);
	List<Person> findAll();
	boolean save(Person p);
	boolean update(Person p);
	boolean delete(Person p);
	boolean deleteById(Long id);
}
