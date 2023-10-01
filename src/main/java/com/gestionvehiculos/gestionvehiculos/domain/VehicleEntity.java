package com.gestionvehiculos.gestionvehiculos.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "vehicle", uniqueConstraints = {
        @UniqueConstraint(name = "uk_plate", columnNames = {"plate"}),
        @UniqueConstraint(name = "uk_vin", columnNames = {"vin"})
})
public class VehicleEntity implements Serializable {

    private static final long serialVersionUID = 237L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "plate", length = 10, nullable = false)
    private String plate;

    @NotNull
    @Column(name = "vin", length = 30, nullable = false)
    private String vin;

    @NotNull
    @Column(name = "line", length = 20)
    private String line;
    @NotNull
    @Column(name = "color", length = 20)
    private String color;
    @NotNull
    @Column(name = "chassis", length = 40)
    private String chassis;

    @JsonIgnore
    @NotNull
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = ("fk_brand_id"), nullable = false, foreignKey = @ForeignKey(name = ("fk_vehicle_brand_id")), referencedColumnName = ("id"))
    private BrandEntity brandId;

    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = ("fk_owner_id"), nullable = false, foreignKey = @ForeignKey(name = ("fk_owner_vehicle_id")), referencedColumnName = ("ownerId"))
    private OwnerEntity ownerId;


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

    public BrandEntity getBrandId() {
        return brandId;
    }

    public void setBrandId(BrandEntity brandId) {
        this.brandId = brandId;
    }

    public OwnerEntity getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(OwnerEntity ownerId) {
        this.ownerId = ownerId;
    }
}
