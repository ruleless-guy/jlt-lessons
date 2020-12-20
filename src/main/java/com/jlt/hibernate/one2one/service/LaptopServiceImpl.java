package com.jlt.hibernate.one2one.service;

import java.util.ArrayList;
import java.util.List;

import com.jlt.hibernate.one2one.dto.LaptopDto;
import com.jlt.hibernate.one2one.entity.Laptop;
import com.jlt.hibernate.one2one.repository.LaptopRepository;

public class LaptopServiceImpl implements LaptopService{
	
	private LaptopRepository laptopRepository;
	
	public LaptopServiceImpl(LaptopRepository laptopRepository) {
		this.laptopRepository = laptopRepository;
	}

	@Override
	public boolean save(LaptopDto entity) {
		Laptop laptop = entity.getEntity();
		return laptopRepository.save(laptop);
	}

	@Override
	public LaptopDto findOne(Long id) {
		Laptop laptop = laptopRepository.findOne(id);
		LaptopDto laptopDto = new LaptopDto(laptop);
		return laptopDto;
	}

	@Override
	public List<LaptopDto> findAll() {
		List<LaptopDto> laptopDtoList = null;
		List<Laptop> laptopList = laptopRepository.findAll();
		for(Laptop l : laptopList) {
			if( null == laptopDtoList ) {
				laptopDtoList = new ArrayList<>();
			}
			laptopDtoList.add(new LaptopDto(l));
		}
		return laptopDtoList;
	}

	@Override
	public boolean update(LaptopDto entity) {
		Laptop l = entity.getEntity();
		return laptopRepository.update(l);
	}

	@Override
	public boolean delete(LaptopDto entity) {
		Laptop l = entity.getEntity();
		return laptopRepository.delete(l);
	}

	@Override
	public boolean deleteById(Long id) {
		return laptopRepository.deleteById(id);
	}

}
