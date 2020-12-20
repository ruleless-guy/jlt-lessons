package com.jlt.hibernate.one2one.repository;

import com.jlt.hibernate.one2one.dao.AbstractDaoImpl;
import com.jlt.hibernate.one2one.entity.Laptop;

public class LaptopDaoImpl extends AbstractDaoImpl<Laptop, Long> implements LaptopRepository{
	public LaptopDaoImpl() {
		super();
	}
}
