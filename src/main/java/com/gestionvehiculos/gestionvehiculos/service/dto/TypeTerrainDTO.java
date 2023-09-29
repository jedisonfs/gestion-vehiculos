package com.gestionvehiculos.gestionvehiculos.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class TypeTerrainDTO implements Serializable {

    @NotNull
    private Integer id;

    @NotNull
    private String nameTerrain;

    private TypeVehicleDTO typeVehicleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTerrain() {
        return nameTerrain;
    }

    public void setNameTerrain(String nameTerrain) {
        this.nameTerrain = nameTerrain;
    }

    public TypeVehicleDTO getTypeVehicleId() {
        return typeVehicleId;
    }

    public void setTypeVehicleId(TypeVehicleDTO typeVehicleId) {
        this.typeVehicleId = typeVehicleId;
    }
}
