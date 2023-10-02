package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.domain.OwnerEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.OwnerDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface OwnerService {

    Boolean exists(Integer id);

    List<OwnerDTO> findAll();

    Boolean existsByDocumentNumber(String documentNumber);

    Boolean existsByEmail(String email);

    List<OwnerDTO> findAllByFirstNameAndFirstSurname(String firstName, String firstSurname);

    @Transactional(readOnly = true)
    OwnerDTO findByownerId(Integer ownerId);

    @Transactional(readOnly = true)
    OwnerDTO findByDocumentNumber(String documentNumber);

    @Transactional(readOnly = true)
    OwnerDTO findByEmail(String email);

//    OwnerDTO save(OwnerDTO OwnerDTO);
//
//    OwnerDTO update(OwnerDTO OwnerDTO);
//
    OwnerEntity save(OwnerEntity OwnerDTO);

    OwnerEntity update(OwnerEntity OwnerDTO);

    void deleteById(Integer id);

    void deleteByDocumentNumber(String documentNumber);
}
