package com.gestionvehiculos.gestionvehiculos.service.impl;

import com.gestionvehiculos.gestionvehiculos.domain.BrandEntity;
import com.gestionvehiculos.gestionvehiculos.repository.BrandRepository;
import com.gestionvehiculos.gestionvehiculos.service.dto.BrandDTO;
import com.gestionvehiculos.gestionvehiculos.service.BrandService;
import com.gestionvehiculos.gestionvehiculos.service.mapper.BrandMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component("BrandServiceImpl")
@Transactional
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;
    private final BrandMapper mapper;

    public BrandServiceImpl(BrandRepository brandRepository, BrandMapper mapper) {
        this.brandRepository = brandRepository;
        this.mapper = mapper;
    }

    @Override
    public Boolean exists(Integer id) {
        return brandRepository.existsById(id);
    }

    @Override
    public List<BrandDTO> findAll() {
        return brandRepository.findAll()
                .stream()
                .map(mapper::toBrandDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Boolean existsByBrandName(String brandName) {
        return brandRepository.existsByBrandName(brandName);
    }

    @Override
    public BrandDTO findById(Integer id) {
        return brandRepository.findById(id)
                .map(mapper::toBrandDTO)
                .orElseThrow(() -> new NullPointerException("Not found brand of vehicle"));
    }

    @Override
    public BrandDTO findByBrandName(String brandName) {
        return brandRepository.findByBrandName(brandName)
                .map(mapper::toBrandDTO)
                .orElseThrow(() -> new NullPointerException("Not found brand of vehicle"));
    }

    @Override
    public BrandDTO save(BrandDTO brandDTO) {
        BrandEntity entity = brandRepository.save(mapper.toBrandEntity(brandDTO));
        return mapper.toBrandDTO(entity);
    }

    @Override
    public BrandDTO update(BrandDTO brandDTO) {
        BrandEntity entity = brandRepository.save(mapper.toBrandEntity(brandDTO));
        return mapper.toBrandDTO(entity);
    }

    @Override
    public void deleteById(Integer id) {
        brandRepository.deleteById(id);
    }

    @Override
    public void deleteByBrandName(String brandName) {
        brandRepository.deleteByBrandName(brandName);
    }
}
