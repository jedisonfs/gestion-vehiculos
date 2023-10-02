package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface TypeVehicleService {

    Boolean existsById(Integer id);
    Boolean existsByNameTypeVehicle(String nameTypeVehicle);

    List<TypeVehicleDTO> findAll();

    @Transactional(readOnly = true)
    TypeVehicleDTO findById(Integer id);

    @Transactional(readOnly = true)
    TypeVehicleDTO findByNameTypeVehicle(String nameTypeVehicle);

    TypeVehicleDTO save(TypeVehicleDTO typeVehicleDTO);

    TypeVehicleDTO update(TypeVehicleDTO typeVehicleDTO);

    void deleteById(Integer id);
    void deleteByNameTypeVehicle(String nameTypeVehicle);




}
