package com.gestionvehiculos.gestionvehiculos.service.dto;


import lombok.*;

import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class TypeDocumentDTO implements Serializable {

    private static final long serialVersionUID = 36L;


    @NotNull
    private Integer id;

    @NotNull
    private String initials;

    @NotNull
    private String documentName;

//    private List<OwnerDTO> ownerList;

}
