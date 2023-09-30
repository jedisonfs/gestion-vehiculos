package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.domain.TypeDocumentEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeDocumentDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeDocumentService {

    Boolean exists(Integer id);
    Boolean existsByInitial(String initial);

    @Transactional(readOnly = true)
    TypeDocumentDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeDocumentDTO findByInitials(String initials);

    TypeDocumentDTO save(TypeDocumentDTO typeDocumentDTO);

    TypeDocumentDTO update(TypeDocumentDTO typeDocumentDTO);

    void deleteById(Integer id);
    void deleteByInitials(String initials);
}
