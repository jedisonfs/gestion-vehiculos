package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeTerrainDTO;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeTerrainService {

    @Transactional(readOnly = true)
    TypeTerrainDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeTerrainDTO findByNameTerrain(String nameTerrain);

    TypeTerrainDTO save(TypeTerrainDTO TypeTerrainDTO);

    TypeTerrainDTO update(TypeTerrainDTO TypeTerrainDTO);

    void deleteById(Integer id);
    void deleteByNameTerrain(String nameTerrain);
}
