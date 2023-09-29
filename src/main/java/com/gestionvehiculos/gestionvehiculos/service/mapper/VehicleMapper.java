package com.gestionvehiculos.gestionvehiculos.service.mapper;

import com.gestionvehiculos.gestionvehiculos.domain.VehicleEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component("VehicleMapper")
@Mapper(componentModel = "spring")
public interface VehicleMapper {

    VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);

    @Mapping(source = "vehicleEntity.plate", target = "plate")
    @Mapping(source = "vehicleEntity.vin", target = "vin")
    @Mapping(source = "vehicleEntity.line", target = "line")
    @Mapping(source = "vehicleEntity.color", target = "color")
    @Mapping(source = "vehicleEntity.chassis", target = "chassis")
    VehicleDTO toVehicleDTO(VehicleEntity vehicleEntity);

    @InheritConfiguration
    VehicleEntity toVehicleEntity(VehicleDTO vehicleDTO);

}
