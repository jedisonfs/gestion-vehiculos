package com.gestionvehiculos.gestionvehiculos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "type_vehicle")
public class TypeVehicleEntity implements Serializable {

    private static final long serialVersionUID = 657L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Column(name = "name_type_vehicle", length = 20)
    private String nameTypeVehicle;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_type_terrain_id"/*, nullable = false, foreignKey = @ForeignKey(name = ("fk_type_terrain_vehicle_id")), referencedColumnName = ("id")*/)
    private TypeTerrainEntity typeTerrainId;

//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "typeVehicleId")
//    private OwnerEntity ownerEntityId;

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

    public TypeTerrainEntity getTypeTerrainId() {
        return typeTerrainId;
    }

    public void setTypeTerrainId(TypeTerrainEntity typeTerrainId) {
        this.typeTerrainId = typeTerrainId;
    }

//    public OwnerEntity getOwnerEntityId() {
//        return ownerEntityId;
//    }
//
//    public void setOwnerEntityId(OwnerEntity ownerEntityId) {
//        this.ownerEntityId = ownerEntityId;
//    }
}
