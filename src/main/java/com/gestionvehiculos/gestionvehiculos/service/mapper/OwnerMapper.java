package com.gestionvehiculos.gestionvehiculos.service.mapper;

import com.gestionvehiculos.gestionvehiculos.domain.OwnerEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.OwnerDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component("OwnerMapper")
@Mapper(componentModel = "spring")
public interface OwnerMapper {

    OwnerMapper INSTANCE = Mappers.getMapper(OwnerMapper.class);

    @Mapping(source = "ownerEntity.ownerId", target = "id")
    @Mapping(source = "ownerEntity.documentNumber", target = "documentNumber")
    @Mapping(source = "ownerEntity.firstName", target = "firstName")
    @Mapping(source = "ownerEntity.secondName", target = "secondName")
    @Mapping(source = "ownerEntity.firstSurname", target = "firstSurname")
    @Mapping(source = "ownerEntity.secondSurname", target = "secondSurname")
    @Mapping(source = "ownerEntity.dateOfBirth", target = "dateOfBirth")
    @Mapping(source = "ownerEntity.address", target = "address")
    @Mapping(source = "ownerEntity.email", target = "email")
    @Mapping(source = "ownerEntity.phone", target = "phone")
    @Mapping(source = "ownerEntity.typeDocumentId.documentName", target = "document")
    @Mapping(source = "ownerEntity.vehicleId.plate", target = "plate")
    @Mapping(source = "ownerEntity.vehicleId.brandId.brandName", target = "brandName")
    @Mapping(source = "ownerEntity.vehicleId.color", target = "colorVehicle")
    OwnerDTO toOwnerDTO(OwnerEntity ownerEntity);
    @InheritConfiguration
    OwnerEntity toOwnerEntity(OwnerDTO ownerDTO);
}
