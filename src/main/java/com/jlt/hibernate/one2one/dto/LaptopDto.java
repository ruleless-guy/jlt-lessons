package com.jlt.hibernate.one2one.dto;

import com.jlt.hibernate.one2one.entity.BaseEntity;
import com.jlt.hibernate.one2one.entity.Laptop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LaptopDto extends BaseEntity<Long>{
	private String brand;
	private String description;
	
	public LaptopDto(Laptop laptop) {
		this.id = laptop.getId();
		this.brand = laptop.getBrand();
		this.description = laptop.getDescription();
	}
	
	public Laptop getEntity() {
		Laptop laptop = new Laptop();
		laptop.setId(this.id);
		laptop.setBrand(this.brand);
		laptop.setDescription(this.description);
		return laptop;
	}
	
}
