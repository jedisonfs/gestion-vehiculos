package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.TypeVehicleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypeVehicleRepository extends CrudRepository<TypeVehicleEntity, Integer> {

    Boolean existsByNameTypeVehicle(String name);
    Optional<TypeVehicleEntity> findByNameTypeVehicle(String name);

    List<TypeVehicleEntity> findAll();
}
