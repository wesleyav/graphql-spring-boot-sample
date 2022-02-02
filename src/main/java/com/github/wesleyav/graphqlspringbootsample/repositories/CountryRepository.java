package com.github.wesleyav.graphqlspringbootsample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.wesleyav.graphqlspringbootsample.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
