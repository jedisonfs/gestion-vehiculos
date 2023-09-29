package com.gestionvehiculos.gestionvehiculos.service.mapper;

import com.gestionvehiculos.gestionvehiculos.domain.TypeVehicleEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component("TypeVehicleMapper")
@Mapper(componentModel = "spring")
public interface TypeVehicleMapper {

    TypeVehicleMapper INSTANCE = Mappers.getMapper(TypeVehicleMapper.class);

    @Mapping(source = "typeVehicleDTO.id", target = "id")
    @Mapping(source = "typeVehicleDTO.nameTypeVehicle.id", target = "id")
    @Mapping(source = "typeVehicleDTO.typeTerrainId.id", target = "id")
    @Mapping(source = "typeVehicleDTO.ownerEntityId.id", target = "id")
    TypeVehicleDTO toTypeVehicleDTO(TypeVehicleDTO typeVehicleDTO);

    @InheritConfiguration
    TypeVehicleEntity toTypeVehicleEntity(TypeVehicleEntity typeVehicleEntity);
}
