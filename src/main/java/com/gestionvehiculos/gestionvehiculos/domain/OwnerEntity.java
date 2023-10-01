package com.gestionvehiculos.gestionvehiculos.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "owner", uniqueConstraints = {
        @UniqueConstraint(name = "uk_document_number", columnNames = {"document_number"}),
        @UniqueConstraint(name = "uk_email", columnNames = {"email"})
})
public class OwnerEntity implements Serializable {

    private static final long serialVersionUID = 56L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ownerId;

    @NotNull
    @Column(name = ("document_number"), length = 15, nullable = false)
    private String documentNumber;

    @NotNull
    @Column(name = ("first_name"), length = 20, nullable = false)
    private String firstName;

    @Column(name = ("second_name"), length = 20)
    private String secondName;

    @NotNull
    @Column(name = ("first_surname"), length = 20, nullable = false)
    private String firstSurname;

    @Column(name = ("second_surname"), length = 20)
    private String secondSurname;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    private String address;

    @Email
    @NotNull
    private String email;

    @NotNull
    private String phone;


    @NotNull
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = ("fk_type_document_id"), nullable = false, foreignKey = @ForeignKey(name = ("fk_owner_type_document_id")), referencedColumnName = ("id"))
    private TypeDocumentEntity typeDocumentId;

//    @OneToOne(optional = false, fetch = FetchType.LAZY)
//    @JoinColumn(name = "fk_type_vehicle_id", nullable = false, foreignKey = @ForeignKey(name = "fk_owner_type_vehicle"), referencedColumnName = "id")
//    private TypeVehicleEntity typeVehicleId;

    @OneToMany(mappedBy = "ownerId", cascade = CascadeType.ALL)
    private List<VehicleEntity> vehicleId;

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TypeDocumentEntity getTypeDocumentId() {
        return typeDocumentId;
    }

    public void setTypeDocumentId(TypeDocumentEntity typeDocumentId) {
        this.typeDocumentId = typeDocumentId;
    }

    public List<VehicleEntity> getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(List<VehicleEntity> vehicleId) {
        this.vehicleId = vehicleId;
    }

    //    public TypeVehicleEntity getTypeVehicleId() {
//        return typeVehicleId;
//    }
//
//    public void setTypeVehicleId(TypeVehicleEntity typeVehicleId) {
//        this.typeVehicleId = typeVehicleId;
//    }
}
