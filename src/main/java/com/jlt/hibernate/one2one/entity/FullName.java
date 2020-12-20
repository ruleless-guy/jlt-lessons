package com.jlt.hibernate.one2one.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FullName {
	
	@Column(name = "first_name", length = 20, nullable = false)
	private String firstName;
	
	@Column(name = "last_name", length = 20, nullable = false)
	private String lastName;
	
	@Override
	public String toString() {
		return firstName+" "+lastName;
	}
}
