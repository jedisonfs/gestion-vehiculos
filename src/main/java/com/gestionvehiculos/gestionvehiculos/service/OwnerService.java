package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.OwnerDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface OwnerService {

    @Transactional(readOnly = true)
    OwnerDTO findByownerId(Integer ownerId);

    @Transactional(readOnly = true)
    OwnerDTO findByDocumentNumber(String documentNumber);

    @Transactional(readOnly = true)
    OwnerDTO findByEmail(String email);

    OwnerDTO save(OwnerDTO OwnerDTO);

    OwnerDTO update(OwnerDTO OwnerDTO);

    void deleteById(Integer id);

    void deleteByDocumentNumber(String documentNumber);
}
