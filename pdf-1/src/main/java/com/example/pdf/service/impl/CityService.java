package com.example.pdf.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pdf.model.City;
import com.example.pdf.service.ICityService;

@Service
public class CityService implements ICityService{

	@Override
    public List<City> findAll() {
		List<City> lisCity = new ArrayList<City>();
		lisCity.add(new City(1l,"uno", 1));
		lisCity.add(new City(2l, "dos", 2));
		
		return lisCity;
	}
}
