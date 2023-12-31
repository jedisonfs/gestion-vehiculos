package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.domain.TypeVehicleEntity;
import com.gestionvehiculos.gestionvehiculos.repository.TypeVehicleRepository;
import com.gestionvehiculos.gestionvehiculos.service.TypeVehicleService;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import com.gestionvehiculos.gestionvehiculos.service.mapper.TypeVehicleMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Component("TypeVehicleServiceImpl")
public class TypeVehicleServiceImpl implements TypeVehicleService {

    private final TypeVehicleRepository repository;
    private final TypeVehicleMapper mapper;

    public TypeVehicleServiceImpl(TypeVehicleRepository repository, TypeVehicleMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Boolean existsById(Integer id) {
        return repository.existsById(id);
    }

    @Override
    public Boolean existsByNameTypeVehicle(String nameTypeVehicle) {
        return repository.existsByNameTypeVehicle(nameTypeVehicle);
    }

    @Override
    public List<TypeVehicleDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toTypeVehicleDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TypeVehicleDTO findById(Integer id) {
        return repository.findById(id)
                .map(mapper::toTypeVehicleDTO)
                .orElseThrow(() -> new NullPointerException("Not found type vehicle"));
    }

    @Override
    public TypeVehicleDTO findByNameTypeVehicle(String nameTypeVehicle) {
        return repository.findByNameTypeVehicle(nameTypeVehicle)
                .map(mapper::toTypeVehicleDTO)
                .orElseThrow(() -> new NullPointerException("Not found type vehicle"));
    }

    @Override
    public TypeVehicleDTO save(TypeVehicleDTO typeVehicleDTO) {
        TypeVehicleEntity entity = repository.save(mapper.toTypeVehicleEntity(typeVehicleDTO));
        return mapper.toTypeVehicleDTO(entity);
    }

    @Override
    public TypeVehicleDTO update(TypeVehicleDTO typeVehicleDTO) {
        TypeVehicleEntity entity = repository.save(mapper.toTypeVehicleEntity(typeVehicleDTO));
        return mapper.toTypeVehicleDTO(entity);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteByNameTypeVehicle(String nameTypeVehicle) {
        deleteByNameTypeVehicle(nameTypeVehicle);
    }
}
