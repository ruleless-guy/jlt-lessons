package com.jlt.hibernate.one2one.controller;

import com.jlt.hibernate.one2one.view.AbstractView;

public interface AbstractController<Model, View extends AbstractView<Model>> extends AbstractView<Model>{
	Model getModel();
	void setModel(Model model);
	
	View getView();
	void setView(View view);
}
