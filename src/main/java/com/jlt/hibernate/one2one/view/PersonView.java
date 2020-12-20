package com.jlt.hibernate.one2one.view;

import com.jlt.hibernate.one2one.entity.Person;

public class PersonView extends AbstractViewImpl<Person>{

	@Override
	public void printDetails(Person model) {
		StringBuilder sb = new StringBuilder();
		sb.append("Person -> id = ");
		sb.append(model.getId());
		sb.append(", name = ");
		sb.append(model.getFullName());
		sb.append(", age = ");
		sb.append(model.getAge());
		sb.append(", laptop id = ");
		if( null == model.getLaptop() ) {
			sb.append("no laptop");
		}else {
			sb.append(model.getLaptop().getId());
		}
		System.out.println(sb.toString());
	}

}
