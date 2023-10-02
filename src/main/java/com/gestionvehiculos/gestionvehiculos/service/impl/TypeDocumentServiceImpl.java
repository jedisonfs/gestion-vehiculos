package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.domain.TypeDocumentEntity;
import com.gestionvehiculos.gestionvehiculos.repository.TypeDocumenRepository;
import com.gestionvehiculos.gestionvehiculos.service.TypeDocumentService;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeDocumentDTO;
import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import com.gestionvehiculos.gestionvehiculos.service.mapper.TypeDocumentMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Component("TypeDocumentServiceImpl")
public class TypeDocumentServiceImpl implements TypeDocumentService {

    private final TypeDocumenRepository documenRepository;
    private final TypeDocumentMapper documentMapper;

    public TypeDocumentServiceImpl(TypeDocumenRepository documenRepository, TypeDocumentMapper documentMapper) {
        this.documenRepository = documenRepository;
        this.documentMapper = documentMapper;
    }


    @Override
    public Boolean exists(Integer id) {
        return documenRepository.existsById(id);
    }

    @Override
    public Boolean existsByInitial(String initial) {
        return documenRepository.existsByInitials(initial);
    }

    @Override
    public TypeDocumentDTO findById(Integer id) {
        return documenRepository.findById(id)
                .map(documentMapper::toTypeDocumentDTO)
                .orElseThrow(() -> new NullPointerException("Not found typeDocument"));
    }

//    @Override
//    public List<VehicleDTO> findAll() {
//        return r.findAll()
//                .stream()
//                .map(mapper::toVehicleDTO)
//                .collect(Collectors.toList());
//    }

    @Override
    public TypeDocumentDTO findByInitials(String initials) {
        return documenRepository.findByInitials(initials)
                .map(documentMapper::toTypeDocumentDTO)
                .orElseThrow(() -> new NullPointerException("Not found type document"));
    }

    @Override
    public TypeDocumentDTO save(TypeDocumentDTO typeDocumentDTO) {
        TypeDocumentEntity dto = documenRepository.save(documentMapper.toTypeDocumentEntity(typeDocumentDTO));
        return documentMapper.toTypeDocumentDTO(dto);
    }

    @Override
    public TypeDocumentDTO update(TypeDocumentDTO typeDocumentDTO) {
        TypeDocumentEntity dto = documenRepository.save(documentMapper.toTypeDocumentEntity(typeDocumentDTO));
        return documentMapper.toTypeDocumentDTO(dto);
    }

    @Override
    public void deleteById(Integer id) {
        documenRepository.deleteById(id);
    }

    @Override
    public void deleteByInitials(String initials) {
        documenRepository.deleteByInitials(initials);
    }
}
