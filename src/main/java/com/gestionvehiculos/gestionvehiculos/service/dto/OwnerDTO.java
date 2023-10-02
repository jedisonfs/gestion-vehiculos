package com.gestionvehiculos.gestionvehiculos.service.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class OwnerDTO implements Serializable {

    @NotNull
    private Integer id;

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
    private String document;
    @NotNull
    private String nameDocument;
    @NotNull
    private String plate;
    @NotNull
    private String brandName;
    @NotNull
    private String colorVehicle;

}
