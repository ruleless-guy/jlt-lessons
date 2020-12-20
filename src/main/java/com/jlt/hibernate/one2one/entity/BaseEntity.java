package com.jlt.hibernate.one2one.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity <T>{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected T id;
	
	protected BaseEntity() {}
}
