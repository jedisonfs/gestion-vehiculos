package com.gestionvehiculos.gestionvehiculos.controller;

import com.gestionvehiculos.gestionvehiculos.service.OwnerService;
import com.gestionvehiculos.gestionvehiculos.service.dto.OwnerDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/owner/")
public class OwnerController {

    private final OwnerService service;

    public OwnerController(@Qualifier("OwnerServiceImpl") OwnerService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<OwnerDTO> getBrandById(@PathVariable Integer id) {
        if (id != null) {
            return ResponseEntity.ok(service.findByownerId(id));
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("{documentNumber}")
    public ResponseEntity<OwnerDTO> getBrandByDocumentNumber(@PathVariable String documentNumber) {
        if (documentNumber != null) {
            return ResponseEntity.ok(service.findByDocumentNumber(documentNumber));
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("{email}")
    public ResponseEntity<OwnerDTO> getBrandByEmail(@PathVariable String email) {
        if (email != null) {
            return ResponseEntity.ok(service.findByEmail(email));
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity<OwnerDTO> save(@RequestBody OwnerDTO ownerDTO) {
        if (!service.exists(ownerDTO.getId())) {
            return ResponseEntity.ok(service.save(ownerDTO));
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<OwnerDTO> updateBrand(@RequestBody OwnerDTO ownerDTO) {
        if (ownerDTO.getId() != null || service.exists(ownerDTO.getId())) {
            return ResponseEntity.ok(service.save(ownerDTO));
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        if (id != null || service.exists(id)) {
            service.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{documentNumber}")
    public ResponseEntity<Void> deleteByDocumentNumber(@PathVariable String documentNumber) {
        if (documentNumber != null || service.existsByDocumentNumber(documentNumber)) {
            service.deleteByDocumentNumber(documentNumber);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
