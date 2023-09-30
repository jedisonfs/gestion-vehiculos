package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeTerrainDTO;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeTerrainService {

    Boolean exists(Integer id);

    Boolean existsByPlate(String initial);

    @Transactional(readOnly = true)
    TypeVehicleDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeVehicleDTO findByNameTypeVehicle(String plate);

    TypeVehicleDTO save(TypeVehicleDTO TypeVehicleDTO);

    TypeVehicleDTO update(TypeVehicleDTO TypeVehicleDTO);

    void deleteById(Integer id);

    void deleteByNameTypeVehicle(String nameTypeVehicle);
}
