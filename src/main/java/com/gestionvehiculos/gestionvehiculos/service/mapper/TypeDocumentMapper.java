package com.gestionvehiculos.gestionvehiculos.service.mapper;

import com.gestionvehiculos.gestionvehiculos.domain.TypeDocumentEntity;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeDocumentDTO;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component("TypeDocumentMapper")
@Mapper(componentModel = "spring")
public interface TypeDocumentMapper {

    TypeDocumentMapper INSTANCE = Mappers.getMapper(TypeDocumentMapper.class);

    @Mapping(source = "typeDocumentEntity.id", target = "id")
    @Mapping(source = "typeDocumentEntity.initials", target = "initials")
    @Mapping(source = "typeDocumentEntity.documentName", target = "documentName")
    TypeDocumentDTO toTypeDocumentDTO(TypeDocumentEntity typeDocumentEntity);

    @InheritConfiguration
    TypeDocumentEntity toTypeDocumentEntity(TypeDocumentDTO typeDocumentDTO);
}
