package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.domain.TypeTerrainEntity;
import com.gestionvehiculos.gestionvehiculos.repository.TypeTerrainRepository;
import com.gestionvehiculos.gestionvehiculos.service.TypeTerrainService;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeTerrainDTO;
import com.gestionvehiculos.gestionvehiculos.service.mapper.TypeTerrainMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("typeTerrainServiceImpl")
@Transactional
public class TypeTerrainServiceImpl implements TypeTerrainService {

    private final TypeTerrainRepository repository;
    private final TypeTerrainMapper mapper;

    public TypeTerrainServiceImpl(TypeTerrainRepository repository, @Qualifier("TypeTerrainMapper") TypeTerrainMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Boolean exists(Integer id) {
        return repository.existsById(id);
    }

    @Override
    public Boolean existsByNameTerrain(String nameTerrain) {
        return repository.existsByNameTerrain(nameTerrain);
    }

    @Override
    public TypeTerrainDTO findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toTypeTerrainDTO)
                .orElseThrow(() -> new NullPointerException("Not found  type terrain"));
    }

    @Override
    public TypeTerrainDTO findByNameTerrain(String nameTerrain) {
        return repository.findByNameTerrain(nameTerrain)
                .map(mapper::toTypeTerrainDTO)
                .orElseThrow(() -> new NullPointerException("Not found  type terrain"));
    }

    @Override
    public TypeTerrainDTO save(TypeTerrainDTO typeTerrainDTO) {
        TypeTerrainEntity entity = repository.save(mapper.toTypeTerrainEntity(typeTerrainDTO));
        return mapper.toTypeTerrainDTO(entity);
    }

    @Override
    public TypeTerrainDTO update(TypeTerrainDTO typeTerrainDTO) {
        TypeTerrainEntity entity = repository.save(mapper.toTypeTerrainEntity(typeTerrainDTO));
        return mapper.toTypeTerrainDTO(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByNameTerrain(String nameTerrain) {
        repository.deleteByNameTerrain(nameTerrain);
    }
}
