package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.TypeTerrainEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TypeTerrainRepository extends CrudRepository<TypeTerrainEntity, Integer> {

    Boolean existsByNameTerrain(String nameTerrain);
    Optional<TypeTerrainEntity> findByNameTerrain(String nameTerrain);
    void deleteByNameTerrain(String nameTerrain);
}
