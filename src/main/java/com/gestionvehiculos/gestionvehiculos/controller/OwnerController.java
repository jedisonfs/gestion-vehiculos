package com.gestionvehiculos.gestionvehiculos.controller;

import com.gestionvehiculos.gestionvehiculos.domain.OwnerEntity;
import com.gestionvehiculos.gestionvehiculos.repository.OwnerRepository;
import com.gestionvehiculos.gestionvehiculos.service.OwnerService;
import com.gestionvehiculos.gestionvehiculos.service.dto.OwnerDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/owner/")
public class OwnerController {

    private final OwnerService service;
    private final OwnerRepository repository;

    public OwnerController(@Qualifier("OwnerServiceImpl") OwnerService service, OwnerRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @GetMapping("{id}")
    public ResponseEntity<OwnerDTO> getBrandById(@PathVariable Integer id) {
        if (id != null) {
            return ResponseEntity.ok(service.findByownerId(id));
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping
    public ResponseEntity<List<OwnerDTO>> getAllVehicle() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("filter/surname")
    public ResponseEntity<List<OwnerDTO>> getAllByFirstNameAndFirstSurnameq(@RequestParam String firstName, @RequestParam String firstSurname) {
        return ResponseEntity.ok(service.findAllByFirstNameAndFirstSurname(firstName, firstSurname));
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

//    @PostMapping
//    public ResponseEntity<OwnerEntity> save(@RequestBody OwnerEntity ownerDTO) {
//        if (!service.exists(ownerDTO.getOwnerId())) {
//            return ResponseEntity.ok(service.save(ownerDTO));
//        }
//        return ResponseEntity.badRequest().build();
//    }

    @PutMapping("upadate/")
    public ResponseEntity<OwnerEntity> updateBrand(@RequestBody OwnerEntity ownerDTO) {
        if (ownerDTO.getOwnerId() != null || service.exists(ownerDTO.getOwnerId())) {
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

    @PostMapping
    public ResponseEntity<OwnerEntity> save(@RequestBody OwnerEntity ownerDTO) {
        if (!service.exists(ownerDTO.getOwnerId())) {
            return ResponseEntity.ok(repository.save(ownerDTO));
        }
        return ResponseEntity.badRequest().build();
    }
}
