package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface VehicleService {

    @Transactional(readOnly = true)
    VehicleDTO findByrId(Integer id);

    @Transactional(readOnly = true)
    VehicleDTO findByPlate(String plate);

    @Transactional(readOnly = true)
    VehicleDTO findByVin(String vin);

    VehicleDTO save(VehicleDTO VehicleDTO);

    VehicleDTO update(VehicleDTO VehicleDTO);

    void deleteById(Integer id);

    void deleteByPlate(String plate);
    void deleteByVin(String vin);

}
