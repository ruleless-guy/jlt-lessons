package com.jlt.hibernate.one2one.controller;

import java.util.List;

import com.jlt.hibernate.one2one.entity.Laptop;
import com.jlt.hibernate.one2one.view.AbstractView;

public interface LaptopController extends AbstractView<Laptop>{
	Laptop findById(Long id);
	List<Laptop> findAll();
	boolean save(Laptop l);
	boolean update(Laptop l);
	boolean delete(Laptop l);
	boolean deleteById(Long id);
}
