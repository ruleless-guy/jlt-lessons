package com.jlt.hibernate.one2one.service;

import java.util.ArrayList;
import java.util.List;

import com.jlt.hibernate.one2one.dto.PersonDto;
import com.jlt.hibernate.one2one.entity.Person;
import com.jlt.hibernate.one2one.repository.PersonRepository;

public class PersonServiceImpl implements PersonService{
	
	private PersonRepository personRepository;
	
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public boolean save(PersonDto entity) {
		Person p = entity.getEntity();
		return personRepository.save(p);
	}

	@Override
	public PersonDto findOne(Long id) {
		Person p = personRepository.findOne(id);
		PersonDto pDto = null;
		if( null != p) {
			pDto = new PersonDto(p);
		}
		return pDto;
	}

	@Override
	public List<PersonDto> findAll() {
		List<PersonDto> personDtoList = null;
		List<Person> personList = personRepository.findAll();
		for(Person p : personList) {
			if( null == personDtoList ) {
				personDtoList = new ArrayList<>();
			}
			personDtoList.add(new PersonDto(p));
		}
		return personDtoList;
	}

	@Override
	public boolean update(PersonDto entity) {
		Person p = entity.getEntity();
		return personRepository.update(p);
	}

	@Override
	public boolean delete(PersonDto entity) {
		Person p = entity.getEntity();
		return personRepository.delete(p);
	}

	@Override
	public boolean deleteById(Long id) {
		return personRepository.deleteById(id);
	}
	
	

}
