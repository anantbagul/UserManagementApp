package com.bagulIt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bagulIt.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{

}
