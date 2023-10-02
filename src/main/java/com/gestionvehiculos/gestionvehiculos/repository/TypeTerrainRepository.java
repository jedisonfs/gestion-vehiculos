package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.TypeTerrainEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TypeTerrainRepository extends CrudRepository<TypeTerrainEntity, Integer> {

    Boolean existsByNameTerrain(String nameTerrain);
    Optional<TypeTerrainEntity> findByNameTerrain(String nameTerrain);
    List<TypeTerrainEntity> findAll();
    void deleteByNameTerrain(String nameTerrain);
}
