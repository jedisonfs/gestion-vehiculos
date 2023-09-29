package com.gestionvehiculos.gestionvehiculos.service.mapper;

import com.gestionvehiculos.gestionvehiculos.domain.TypeTerrainEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeTerrainDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component("TypeTerrainMapper")
@Mapper(componentModel = "spring")
public interface TypeTerrainMapper {

    TypeTerrainMapper INSTANCE = Mappers.getMapper(TypeTerrainMapper.class);

    @Mapping(source = "typeTerrainEntity.id",target = "id")
    @Mapping(source = "typeTerrainEntity.nameTerrain",target = "nameTerrain")
    TypeTerrainDTO toTypeTerrainDTO(TypeTerrainEntity typeTerrainEntity);

    @InheritConfiguration
    TypeTerrainEntity toTypeTerrainEntity(TypeTerrainDTO typeTerrainEntity);
}
