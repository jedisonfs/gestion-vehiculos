package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.BrandEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BrandRepository extends CrudRepository<BrandEntity, Integer> {

    Boolean existsByBrandName(String brandName);
    List<BrandEntity> findAll();
    Optional<BrandEntity> findByBrandName(String brandName);
    void deleteByBrandName(String brandName);
}
