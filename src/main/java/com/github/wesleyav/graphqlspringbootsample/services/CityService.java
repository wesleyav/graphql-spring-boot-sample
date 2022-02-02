package com.github.wesleyav.graphqlspringbootsample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.wesleyav.graphqlspringbootsample.entities.City;
import com.github.wesleyav.graphqlspringbootsample.repositories.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	public List<City> findAll() {
		return cityRepository.findAll();
	}

	public City findById(Long city_id) {
		return cityRepository.findById(city_id).orElse(null);
	}

}
