package com.github.wesleyav.graphqlspringbootsample.graphqls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.wesleyav.graphqlspringbootsample.entities.City;
import com.github.wesleyav.graphqlspringbootsample.services.CityService;

@Component
public class CityGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private CityService cityService;

	public List<City> cities() {
		return cityService.findAll();
	}

	public City city(Long city_id) {
		return cityService.findById(city_id);
	}

}
