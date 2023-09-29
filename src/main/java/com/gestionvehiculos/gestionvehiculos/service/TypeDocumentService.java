package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeDocumentDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeDocumentService {

    @Transactional(readOnly = true)
    TypeDocumentDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeDocumentDTO findByInitials(String Initials);

    TypeDocumentDTO save(TypeDocumentDTO TypeDocumentDTO);

    TypeDocumentDTO update(TypeDocumentDTO TypeDocumentDTO);

    void deleteById(Integer id);
    void deleteByInitials(String Initials);
}
