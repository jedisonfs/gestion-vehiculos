package com.gestionvehiculos.gestionvehiculos.service.dto;

import com.gestionvehiculos.gestionvehiculos.domain.TypeDocumentEntity;
import com.gestionvehiculos.gestionvehiculos.domain.TypeVehicleEntity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


public class OwnerDTO implements Serializable {

    private Integer ownerId;

    @NotNull
    private String documentNumber;

    @NotNull
    private String firstName;

    private String secondName;

    @NotNull
    private String firstSurname;

    private String secondSurname;

    private Date dateOfBirth;

    private String address;

    @Email
    @NotNull
    private String email;

    @NotNull
    private String phone;


    @NotNull
    private TypeDocumentDTO typeDocumentId;

    private TypeVehicleDTO typeVehicleId;

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

    public TypeDocumentDTO getTypeDocumentId() {
        return typeDocumentId;
    }

    public void setTypeDocumentId(TypeDocumentDTO typeDocumentId) {
        this.typeDocumentId = typeDocumentId;
    }

    public TypeVehicleDTO getTypeVehicleId() {
        return typeVehicleId;
    }

    public void setTypeVehicleId(TypeVehicleDTO typeVehicleId) {
        this.typeVehicleId = typeVehicleId;
    }
}
