package com.gestionvehiculos.gestionvehiculos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "type_terrain")
public class TypeTerrain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "name_terrain", length = 40)
    private String nameTerrain;

    @OneToOne(mappedBy = "typeTerrainId")
    private TypeVehicleEntity typeVehicleId;

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

    public TypeVehicleEntity getTypeVehicleId() {
        return typeVehicleId;
    }

    public void setTypeVehicleId(TypeVehicleEntity typeVehicleId) {
        this.typeVehicleId = typeVehicleId;
    }
}
