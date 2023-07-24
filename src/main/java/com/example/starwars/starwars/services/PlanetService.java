package com.example.starwars.starwars.services;

import org.springframework.stereotype.Service;

import com.example.starwars.starwars.entity.Planet;
import com.example.starwars.starwars.repository.PlanetRepository;

@Service
public class PlanetService {

  private PlanetRepository planetRepository;

  public PlanetService(PlanetRepository planetRepository) {
    this.planetRepository = planetRepository;
  }

  public Planet create(Planet planet){
    return planetRepository.save(planet);
  }
}
