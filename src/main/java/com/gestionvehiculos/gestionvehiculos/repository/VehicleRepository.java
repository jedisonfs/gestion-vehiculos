package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.VehicleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends CrudRepository<VehicleEntity, Integer> {


    Boolean existsByPlate(String plate);
    Boolean existsByVin(String vin);

    List<VehicleEntity> findAll();
    Optional<VehicleEntity> findByPlate(String plate);
    Optional<VehicleEntity> findByVin(String vin);
}
