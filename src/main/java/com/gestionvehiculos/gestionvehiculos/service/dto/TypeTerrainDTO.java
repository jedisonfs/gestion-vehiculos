package com.gestionvehiculos.gestionvehiculos.service.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class TypeTerrainDTO implements Serializable {

    @NotNull
    private Integer id;

    @NotNull
    private String nameTerrain;

//    private TypeVehicleDTO typeVehicleId;

}
