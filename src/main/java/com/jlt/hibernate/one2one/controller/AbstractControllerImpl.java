package com.jlt.hibernate.one2one.controller;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.jlt.hibernate.one2one.view.AbstractView;

public abstract class AbstractControllerImpl<Model, View extends AbstractView<Model>> implements AbstractController<Model, View>{

	private Model model;
	private View view;
	
	@SuppressWarnings("unchecked")
	public AbstractControllerImpl() {
		Class<Model> modelClass = (Class<Model>)((ParameterizedType)(this.getClass().getGenericSuperclass())).getActualTypeArguments()[0];
		Class<View> viewClass = (Class<View>)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		
		model = getInstance(modelClass);
		view = getInstance(viewClass);
	}
	
	private <O> O getInstance(Class<O> o) {
		try {
			return o.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void printDetails(Model model) {
		view.printDetails(model);
	}

	@Override
	public void printDetails(List<Model> modelList) {
		view.printDetails(modelList);
	}

	@Override
	public Model getModel() {
		return model;
	}

	@Override
	public void setModel(Model model) {
		this.model = model;
	}

	@Override
	public View getView() {
		return view;
	}

	@Override
	public void setView(View view) {
		this.view = view;
	}
	
}
