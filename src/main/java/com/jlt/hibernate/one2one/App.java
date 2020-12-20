package com.jlt.hibernate.one2one;

import java.util.List;

import com.jlt.hibernate.one2one.controller.PersonController;
import com.jlt.hibernate.one2one.controller.PersonControllerImpl;
import com.jlt.hibernate.one2one.entity.FullName;
import com.jlt.hibernate.one2one.entity.Laptop;
import com.jlt.hibernate.one2one.entity.Person;
import com.jlt.hibernate.one2one.repository.PersonDaoImpl;
import com.jlt.hibernate.one2one.repository.PersonRepository;
import com.jlt.hibernate.one2one.service.PersonService;
import com.jlt.hibernate.one2one.service.PersonServiceImpl;

public class App {
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		laptop.setBrand("Dell");
		laptop.setDescription("Dell i7 10th generation");
		
		Laptop laptop1 = new Laptop();
		laptop1.setBrand("Acer");
		laptop1.setDescription("Acer i5 10th generation");
		
		Person p = new Person();
		p.setFullName(new FullName("Khun","Pyae Phyo Aung"));
		p.setAge(20);
		p.setLaptop(laptop);
		
		Person p1 = new Person();
		p1.setFullName(new FullName("Than Sin","Cho"));
		p1.setAge(22);
		p1.setLaptop(laptop1);
		
		PersonRepository personRepository = new PersonDaoImpl();
		PersonService personService = new PersonServiceImpl(personRepository);
		PersonController personController = new PersonControllerImpl(personService);
		personController.save(p);
		personController.save(p1);
		
		Person person = personController.findById(1L);
		personController.printDetails(person);
		System.out.println(personController.delete(person));
	}
}
