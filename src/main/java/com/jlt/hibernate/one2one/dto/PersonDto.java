package com.jlt.hibernate.one2one.dto;

import com.jlt.hibernate.one2one.entity.BaseEntity;
import com.jlt.hibernate.one2one.entity.FullName;
import com.jlt.hibernate.one2one.entity.Person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonDto extends BaseEntity<Long>{
	private String firstName;
	private String lastName;
	private int age;
	private LaptopDto laptopDto;
	
	public PersonDto(Person p) {
		this.id = p.getId();
		this.firstName = p.getFullName().getFirstName();
		this.lastName = p.getFullName().getLastName();
		this.age = p.getAge();
		this.laptopDto = new LaptopDto(p.getLaptop());
	}
	
	public Person getEntity() {
		Person person = new Person();
		person.setId(this.id);
		person.setFullName(new FullName(this.firstName, this.lastName));
		person.setAge(this.age);
		person.setLaptop(this.laptopDto.getEntity());
		return person;
	}
}
