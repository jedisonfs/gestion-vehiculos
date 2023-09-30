package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeVehicleService {

    Boolean existsById(Integer id);
    Boolean existsByNameTypeVehicle(String nameTypeVehicle);

    @Transactional(readOnly = true)
    TypeVehicleDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeVehicleDTO findByNameTypeVehicle(String nameTypeVehicle);

    TypeVehicleDTO save(TypeVehicleDTO typeVehicleDTO);

    TypeVehicleDTO update(TypeVehicleDTO typeVehicleDTO);

    void deleteById(Integer id);
    void deleteByNameTypeVehicle(String nameTypeVehicle);




}
