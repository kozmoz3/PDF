package com.example.pdf.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.pdf.model.City;

@Service
public interface ICityService {

	List<City> findAll();
}
