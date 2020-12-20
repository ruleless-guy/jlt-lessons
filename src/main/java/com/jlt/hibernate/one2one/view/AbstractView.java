package com.jlt.hibernate.one2one.view;

import java.util.List;

public interface AbstractView<T> {
	void printDetails(T model);
	void printDetails(List<T> modelList);
}
