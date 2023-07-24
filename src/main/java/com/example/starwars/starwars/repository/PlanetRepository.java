package com.example.starwars.starwars.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.starwars.starwars.entity.Planet;

@Repository
public interface PlanetRepository extends CrudRepository<Planet, Long>{
  
}
