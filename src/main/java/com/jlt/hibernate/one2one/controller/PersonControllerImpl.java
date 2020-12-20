package com.jlt.hibernate.one2one.controller;

import java.util.ArrayList;
import java.util.List;

import com.jlt.hibernate.one2one.dto.PersonDto;
import com.jlt.hibernate.one2one.entity.Person;
import com.jlt.hibernate.one2one.service.PersonService;
import com.jlt.hibernate.one2one.view.PersonView;

public class PersonControllerImpl extends AbstractControllerImpl<Person, PersonView> implements PersonController{

	private PersonService personService;
	
	public PersonControllerImpl(PersonService personService) {
		this.personService = personService;
	}
	
	@Override
	public Person findById(Long id) {
		PersonDto pDto = personService.findOne(id);
		return pDto.getEntity();
	}

	@Override
	public List<Person> findAll() {
		List<PersonDto> pDtoList = personService.findAll();
		List<Person> personList = null;
		for(PersonDto pDto : pDtoList) {
			if ( null == personList) {
				personList = new ArrayList<>();
			}
			personList.add(pDto.getEntity());
		}
		return personList;
	}

	@Override
	public boolean save(Person p) {
		PersonDto pDto = new PersonDto(p);
		return personService.save(pDto);
	}

	@Override
	public boolean update(Person p) {
		PersonDto pDto = new PersonDto(p);
		return personService.update(pDto);
	}

	@Override
	public boolean delete(Person p) {
		PersonDto pDto = new PersonDto(p);
		return personService.delete(pDto);
	}

	@Override
	public boolean deleteById(Long id) {
		return personService.deleteById(id);
	}
	
}
