package com.gestionvehiculos.gestionvehiculos.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class BrandDTO implements Serializable {

    private static final long serialVersionUID = 53L;

    @NotNull
    private Integer id;
    @NotNull
    private String brandName;

    private VehicleDTO vehicleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public VehicleDTO getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(VehicleDTO vehicleId) {
        this.vehicleId = vehicleId;
    }

}
