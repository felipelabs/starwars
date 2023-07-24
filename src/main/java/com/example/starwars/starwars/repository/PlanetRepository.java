package com.example.starwars.starwars.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.starwars.starwars.entity.Planet;

public interface PlanetRepository extends CrudRepository<Planet, Long>{
  
}
