package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeTerrainDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeTerrainServiceImpl {

    @Transactional(readOnly = true)
    TypeTerrainDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeTerrainDTO findByNameTerrain(String nameTerrain);

    TypeTerrainDTO save(TypeTerrainDTO TypeTerrainDTO);

    TypeTerrainDTO update(TypeTerrainDTO TypeTerrainDTO);

    void deleteById(Integer id);
    void deleteByNameTerrain(String nameTerrain);
}
