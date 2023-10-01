package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeTerrainDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeTerrainService {

    Boolean exists(Integer id);

    Boolean existsByNameTerrain(String nameTerrain);

    @Transactional(readOnly = true)
    TypeTerrainDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeTerrainDTO findByNameTerrain(String nameTerrain);

    TypeTerrainDTO save(TypeTerrainDTO TypeVehicleDTO);

    TypeTerrainDTO update(TypeTerrainDTO TypeVehicleDTO);

    void deleteById(Integer id);

    void deleteByNameTerrain(String nameTypeVehicle);
}
