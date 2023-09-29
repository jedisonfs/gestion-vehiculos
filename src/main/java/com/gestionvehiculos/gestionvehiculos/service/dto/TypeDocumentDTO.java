package com.gestionvehiculos.gestionvehiculos.service.dto;


import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.List;

public class TypeDocumentDTO implements Serializable {

    private static final long serialVersionUID = 36L;


    @NotNull
    private Integer id;

    @NotNull
    private String initials;

    @NotNull
    private String documentName;

    private List<OwnerDTO> ownerList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public List<OwnerDTO> getOwnerList() {
        return ownerList;
    }

    public void setOwnerList(List<OwnerDTO> ownerList) {
        this.ownerList = ownerList;
    }
}
