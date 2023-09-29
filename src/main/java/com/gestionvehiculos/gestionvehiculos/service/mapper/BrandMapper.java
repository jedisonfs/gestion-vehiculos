package com.gestionvehiculos.gestionvehiculos.service.mapper;

import com.gestionvehiculos.gestionvehiculos.domain.BrandEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.BrandDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component("BrandMapper")
@Mapper(componentModel = "spring")
public interface BrandMapper {

    BrandMapper INSTANCE = Mappers.getMapper(BrandMapper.class);

    @Mapping(source = "brandEntity.id", target = "id")
    @Mapping(source = "brandEntity.brandName", target = "brandName")
    BrandDTO toBrandDTO(BrandEntity brandEntity);

    @InheritConfiguration
    BrandEntity toBrandEntity(BrandDTO brandDTO);
}
