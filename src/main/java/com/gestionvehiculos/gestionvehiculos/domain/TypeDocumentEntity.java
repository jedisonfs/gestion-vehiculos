package com.gestionvehiculos.gestionvehiculos.domain;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "type_document", uniqueConstraints = {
        @UniqueConstraint(name = "uk_initials", columnNames = {"initials"}),
        @UniqueConstraint(name = "uk_document_name", columnNames = {"document_name"})
})
public class TypeDocumentEntity implements Serializable {

    private static final long serialVersionUID = 36L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotNull
    @Column(name = "initials", length = 6, nullable = false)
    private String initials;

    @NotNull
    @Column(name = "document_name", length = 20, nullable = false)
    private String documentName;

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
}
