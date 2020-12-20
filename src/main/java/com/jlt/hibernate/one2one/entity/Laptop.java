package com.jlt.hibernate.one2one.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "laptop")
@Getter
@Setter
public class Laptop extends BaseEntity<Long>{
	@Column(name = "brand", length = 30, nullable = false)
	private String brand;
	
	@Column(name = "description", length = 500, nullable = true)
	private String description;
}
