package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.TypeTerrainEntity;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface TypeTerrainRepository extends CrudRepository<TypeTerrainEntity, Integer> {
}
