package com.gestionvehiculos.gestionvehiculos.repository;

import com.gestionvehiculos.gestionvehiculos.domain.TypeDocumentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeDocumenRepository extends CrudRepository<TypeDocumentEntity, Integer> {

     Optional<TypeDocumentEntity> findByInitials(String initial);

     void deleteByInitials(String initial);

     Boolean existsByInitials(String initial);
}
