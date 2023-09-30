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
    @Mapping(source = "ownerEntity.secondSurname", target = "dateOfBirth")
    @Mapping(source = "ownerEntity.address", target = "address")
    @Mapping(source = "ownerEntity.email", target = "email")
    @Mapping(source = "ownerEntity.phone", target = "phone")
    OwnerDTO toOwnerDTO(OwnerEntity ownerEntity);
    @InheritConfiguration
    OwnerEntity toOwnerEntity(OwnerDTO ownerDTO);
}
