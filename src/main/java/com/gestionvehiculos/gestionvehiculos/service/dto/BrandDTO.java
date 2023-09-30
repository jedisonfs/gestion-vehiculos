package com.gestionvehiculos.gestionvehiculos.service.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class BrandDTO implements Serializable {

    private static final long serialVersionUID = 53L;

    @NotNull
    private Integer id;
    @NotNull
    private String brandName;

//    private VehicleDTO vehicleId;

}
