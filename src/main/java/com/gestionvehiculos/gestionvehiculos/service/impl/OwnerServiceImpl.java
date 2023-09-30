package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.domain.OwnerEntity;
import com.gestionvehiculos.gestionvehiculos.repository.OwnerRepository;
import com.gestionvehiculos.gestionvehiculos.service.OwnerService;
import com.gestionvehiculos.gestionvehiculos.service.dto.OwnerDTO;
import com.gestionvehiculos.gestionvehiculos.service.mapper.OwnerMapper;
import org.springframework.stereotype.Component;

@Component("OwnerServiceImpl")
public class OwnerServiceImpl implements OwnerService {


    private final OwnerRepository repository;
    private final OwnerMapper mapper;

    public OwnerServiceImpl(OwnerRepository repository, OwnerMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Boolean exists(Integer id) {
        return repository.existsById(id);
    }

    @Override
    public Boolean existsByDocumentNumber(String documentNumber) {
        return repository.existsByDocumentNumber(documentNumber);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return existsByEmail(email);
    }

    @Override
    public OwnerDTO findByownerId(Integer ownerId) {
        return repository.findById(ownerId)
                .map(mapper::toOwnerDTO)
                .orElseThrow(() -> new NullPointerException("Not found Owner"));
    }

    @Override
    public OwnerDTO findByDocumentNumber(String documentNumber) {
        return repository.findByDocumentNumber(documentNumber)
                .map(mapper::toOwnerDTO)
                .orElseThrow(() -> new NullPointerException("Not found Owner"));
    }

    @Override
    public OwnerDTO findByEmail(String email) {
        return repository.findByEmail(email)
                .map(mapper::toOwnerDTO)
                .orElseThrow(() -> new NullPointerException("Not found Owner"));
    }

    @Override
    public OwnerDTO save(OwnerDTO ownerDTO) {
        OwnerEntity entity = repository.save(mapper.toOwnerEntity(ownerDTO));
        return mapper.toOwnerDTO(entity);
    }

    @Override
    public OwnerDTO update(OwnerDTO ownerDTO) {
        OwnerEntity entity = repository.save(mapper.toOwnerEntity(ownerDTO));
        return mapper.toOwnerDTO(entity);
    }

    @Override
    public void deleteById(Integer id) {
        deleteById(id);
    }

    @Override
    public void deleteByDocumentNumber(String documentNumber) {
        repository.deleteByDocumentNumber(documentNumber);
    }
}
