package com.gestionvehiculos.gestionvehiculos.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class TypeVehicleDTO implements Serializable {

    private static final long serialVersionUID = 657L;

    private Integer id;

    @NotNull
    private String nameTypeVehicle;

    private TypeTerrainDTO typeTerrainId;

    private OwnerDTO ownerEntityId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTypeVehicle() {
        return nameTypeVehicle;
    }

    public void setNameTypeVehicle(String nameTypeVehicle) {
        this.nameTypeVehicle = nameTypeVehicle;
    }

    public TypeTerrainDTO getTypeTerrainId() {
        return typeTerrainId;
    }

    public void setTypeTerrainId(TypeTerrainDTO typeTerrainId) {
        this.typeTerrainId = typeTerrainId;
    }

    public OwnerDTO getOwnerEntityId() {
        return ownerEntityId;
    }

    public void setOwnerEntityId(OwnerDTO ownerEntityId) {
        this.ownerEntityId = ownerEntityId;
    }
}
