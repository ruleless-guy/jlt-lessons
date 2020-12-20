package com.jlt.hibernate.one2one.controller;

import java.util.ArrayList;
import java.util.List;

import com.jlt.hibernate.one2one.dto.LaptopDto;
import com.jlt.hibernate.one2one.entity.Laptop;
import com.jlt.hibernate.one2one.service.LaptopService;
import com.jlt.hibernate.one2one.view.LaptopView;

public class LaptopControllerImpl extends AbstractControllerImpl<Laptop, LaptopView> implements LaptopController{

	private LaptopService laptopService;
	
	public LaptopControllerImpl(LaptopService laptopService) {
		this.laptopService = laptopService;
	}
	
	@Override
	public Laptop findById(Long id) {
		LaptopDto lDto = laptopService.findOne(id);
		return lDto == null ? null : lDto.getEntity();
	}

	@Override
	public List<Laptop> findAll() {
		List<LaptopDto> laptopDtoList = laptopService.findAll();
		List<Laptop> laptopList = null;
		for(LaptopDto lDto : laptopDtoList ) {
			if(null == laptopList ) {
				laptopList = new ArrayList<>();
			}
			laptopList.add(lDto.getEntity());
		}
		return laptopList;
	}

	@Override
	public boolean save(Laptop l) {
		LaptopDto lDto = new LaptopDto(l);
		return laptopService.save(lDto);
	}

	@Override
	public boolean update(Laptop l) {
		LaptopDto lDto = new LaptopDto(l);
		return laptopService.update(lDto);
	}

	@Override
	public boolean delete(Laptop l) {
		LaptopDto lDto = new LaptopDto(l);
		return laptopService.delete(lDto);
	}

	@Override
	public boolean deleteById(Long id) {
		return laptopService.deleteById(id);
	}

	@Override
	public void printDetails(Laptop model) {
		// TODO Auto-generated method stub
		super.printDetails(model);
	}

	@Override
	public void printDetails(List<Laptop> modelList) {
		// TODO Auto-generated method stub
		super.printDetails(modelList);
	}

	@Override
	public Laptop getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

	@Override
	public void setModel(Laptop model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	@Override
	public LaptopView getView() {
		// TODO Auto-generated method stub
		return super.getView();
	}

	@Override
	public void setView(LaptopView view) {
		// TODO Auto-generated method stub
		super.setView(view);
	}
	
	

}
