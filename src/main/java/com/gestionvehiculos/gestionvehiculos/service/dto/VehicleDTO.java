package com.gestionvehiculos.gestionvehiculos.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class VehicleDTO implements Serializable {

    private static final long serialVersionUID = 237L;

    @NotNull
    private Integer id;

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
    private BrandDTO brandId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public BrandDTO getBrandId() {
        return brandId;
    }

    public void setBrandId(BrandDTO brandId) {
        this.brandId = brandId;
    }

}
