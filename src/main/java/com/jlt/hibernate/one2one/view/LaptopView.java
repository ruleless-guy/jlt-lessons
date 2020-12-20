package com.jlt.hibernate.one2one.view;

import com.jlt.hibernate.one2one.entity.Laptop;

public class LaptopView extends AbstractViewImpl<Laptop>{

	@Override
	public void printDetails(Laptop model) {
		StringBuilder sb = new StringBuilder();
		sb.append("Laptop -> id = ");
		sb.append(model.getId());
		sb.append(", brand = ");
		sb.append(model.getBrand());
		sb.append(", description = ");
		sb.append(model.getDescription() == null ? "no description" : model.getDescription());
	}

}
