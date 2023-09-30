package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.domain.VehicleEntity;
import com.gestionvehiculos.gestionvehiculos.repository.VehicleRepository;
import com.gestionvehiculos.gestionvehiculos.service.VehicleService;
import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import com.gestionvehiculos.gestionvehiculos.service.mapper.VehicleMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("VehicleServiceImpl")
@Transactional
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository repository;
    private final VehicleMapper mapper;

    public VehicleServiceImpl(VehicleRepository repository, @Qualifier("vehicleMapperImpl") VehicleMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public Boolean exists(Integer id) {
        return repository.existsById(id);
    }

    @Override
    public Boolean existsByPlate(String plate) {
        return repository.existsByPlate(plate);
    }

    @Override
    public Boolean existsByVin(String vin) {
        return repository.existsByVin(vin);
    }

    @Override
    public VehicleDTO findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toVehicleDTO)
                .orElseThrow(() -> new NullPointerException("Not found vehicle"));
    }

    @Override
    public VehicleDTO findByPlate(String plate) {
        return repository.findByPlate(plate)
                .map(mapper::toVehicleDTO)
                .orElseThrow(() -> new NullPointerException("Not found vehicle"));
    }

    @Override
    public VehicleDTO findByVin(String vin) {
        return repository.findByVin(vin)
                .map(mapper::toVehicleDTO)
                .orElseThrow(() -> new NullPointerException("Not found vehicle"));
    }

    @Override
    public VehicleDTO save(VehicleDTO vehicleDTO) {
        VehicleEntity entity = repository.save(mapper.toVehicleEntity(vehicleDTO));
        return mapper.toVehicleDTO(entity);
    }

    @Override
    public VehicleDTO update(VehicleDTO vehicleDTO) {
        VehicleEntity entity = repository.save(mapper.toVehicleEntity(vehicleDTO));
        return mapper.toVehicleDTO(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByPlate(String plate) {
        deleteByPlate(plate);
    }

    @Override
    public void deleteByVin(String vin) {
        deleteByVin(vin);
    }
}
