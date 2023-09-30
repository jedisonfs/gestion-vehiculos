package com.gestionvehiculos.gestionvehiculos.service.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class TypeVehicleDTO implements Serializable {

    private static final long serialVersionUID = 657L;

    @NotNull
    private Integer id;

    @NotNull
    private String nameTypeVehicle;

//    private TypeTerrainDTO typeTerrainId;
//
//    private OwnerDTO ownerEntityId;

}
