package com.gestionvehiculos.gestionvehiculos.service;

import com.gestionvehiculos.gestionvehiculos.service.dto.BrandDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface BrandService {

    @Transactional(readOnly = true)
    BrandDTO findById(Integer id);

    @Transactional(readOnly = true)
    BrandDTO findByBrandName(String brandName);

    @Transactional(readOnly = true)
    BrandDTO findByEmail(String email);

    BrandDTO save(BrandDTO BrandDTO);

    BrandDTO update(BrandDTO BrandDTO);

    void deleteById(Integer id);

    void deleteByBrandName(String brandName);
}
