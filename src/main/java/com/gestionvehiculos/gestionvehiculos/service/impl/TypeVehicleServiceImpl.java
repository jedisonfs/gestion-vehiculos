package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface TypeVehicleServiceImpl {

    @Transactional(readOnly = true)
    TypeVehicleDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeVehicleDTO findByPlate(String plate);

    TypeVehicleDTO save(TypeVehicleDTO TypeVehicleDTO);

    TypeVehicleDTO update(TypeVehicleDTO TypeVehicleDTO);

    void deleteById(Integer id);
    void deleteBynameTypeVehicle(String nameTypeVehicle);




}
