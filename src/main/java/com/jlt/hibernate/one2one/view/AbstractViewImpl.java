package com.jlt.hibernate.one2one.view;

import java.util.List;

public abstract class AbstractViewImpl<T> implements AbstractView<T>{

	@Override
	public void printDetails(List<T> modelList) {
		for(T model : modelList) {
			printDetails(model);
		}
	}
	
}
