package com.gestionvehiculos.gestionvehiculos.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "brand", uniqueConstraints = {
        @UniqueConstraint(name = "uk_brand_name", columnNames = {"brand_name"})
})
public class BrandEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "brand_name", length = 40)
    private String brandName;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "brandId")
    private VehicleEntity vehicleId;

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

    public VehicleEntity getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(VehicleEntity vehicleId) {
        this.vehicleId = vehicleId;
    }

}
