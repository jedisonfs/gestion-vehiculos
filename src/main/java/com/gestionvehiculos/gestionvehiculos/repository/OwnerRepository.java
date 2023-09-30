package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.OwnerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OwnerRepository extends CrudRepository<OwnerEntity, Integer> {

    Boolean existsByDocumentNumber(String documentNumber);
    Optional<OwnerEntity> findByEmail(String email);
    Optional<OwnerEntity> findByDocumentNumber(String documentNumber);
    void deleteByDocumentNumber(String documentNumber);
    void deleteByEmail(String email);
}
