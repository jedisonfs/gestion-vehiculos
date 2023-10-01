package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.BrandDTO;
import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface BrandService {

    Boolean exists(Integer id);

    List<BrandDTO> findAll();

    Boolean existsByBrandName(String brandName);

    @Transactional(readOnly = true)
    BrandDTO findById(Integer id);

    @Transactional(readOnly = true)
    BrandDTO findByBrandName(String brandName);

    BrandDTO save(BrandDTO BrandDTO);

    BrandDTO update(BrandDTO BrandDTO);

    void deleteById(Integer id);

    void deleteByBrandName(String brandName);
}
