package com.gestionvehiculos.gestionvehiculos.service.dto;

import lombok.*;

import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class VehicleDTO implements Serializable {

    private static final long serialVersionUID = 237L;

//    private Integer id;

    @NotNull
    private String plate;

    @NotNull
    private String vin;

    @NotNull
    private String line;
    @NotNull
    private String color;
    @NotNull
    private String chassis;

    @NotNull
    private String brandName;

    @NotNull
    private String nameTypeVehicle;

}
