package com.github.wesleyav.graphqlspringbootsample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.wesleyav.graphqlspringbootsample.entities.Country;
import com.github.wesleyav.graphqlspringbootsample.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	public List<Country> findAll() {
		return countryRepository.findAll();
	}

	public Country findById(Long country_id) {
		return countryRepository.findById(country_id).orElse(null);
	}

}
