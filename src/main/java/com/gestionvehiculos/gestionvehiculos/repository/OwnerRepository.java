package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.OwnerEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository extends CrudRepository<OwnerEntity, Integer> {

    Boolean existsByDocumentNumber(String documentNumber);
    Optional<OwnerEntity> findByEmail(String email);
    Optional<OwnerEntity> findByDocumentNumber(String documentNumber);

    List<OwnerEntity> findAllByFirstNameAndFirstSurname(String firstName, String firstSurname);
    OwnerEntity save(OwnerEntity ownerEntity);

    List<OwnerEntity> findAll();
    void deleteByDocumentNumber(String documentNumber);
    void deleteByEmail(String email);
}
