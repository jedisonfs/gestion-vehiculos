package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface VehicleService {

    Boolean exists(Integer id);

    Boolean existsByPlate(String plate);
    Boolean existsByVin(String vin);

    @Transactional(readOnly = true)
    VehicleDTO findById(Integer id);

    @Transactional(readOnly = true)
    VehicleDTO findByPlate(String plate);

    @Transactional(readOnly = true)
    VehicleDTO findByVin(String vin);

    VehicleDTO save(VehicleDTO vehicleDTO);

    VehicleDTO update(VehicleDTO vehicleDTO);

    void deleteById(Integer id);

    void deleteByPlate(String plate);

    void deleteByVin(String vin);

}
