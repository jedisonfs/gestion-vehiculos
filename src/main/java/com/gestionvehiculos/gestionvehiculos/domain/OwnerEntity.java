package com.gestionvehiculos.gestionvehiculos.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "owner") //, uniqueConstraints = {
//        @UniqueConstraint(name = "uk_customer", columnNames = {"document_number", "id_type_document"}),
//        @UniqueConstraint(name = "uk_id_user", columnNames = {"id_user"})
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

    private String address;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_of_birth")
    private Date dateOfBirth;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
