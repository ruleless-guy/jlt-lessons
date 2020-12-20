package com.jlt.hibernate.one2one.repository;

import com.jlt.hibernate.one2one.dao.AbstractDaoImpl;
import com.jlt.hibernate.one2one.entity.Person;

public class PersonDaoImpl extends AbstractDaoImpl<Person, Long> implements PersonRepository {
	public PersonDaoImpl() {
		super();
	}
}
