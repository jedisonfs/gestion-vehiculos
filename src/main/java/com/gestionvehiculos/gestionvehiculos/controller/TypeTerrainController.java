package com.gestionvehiculos.gestionvehiculos.controller;

import com.gestionvehiculos.gestionvehiculos.service.dto.TypeTerrainDTO;
import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.gestionvehiculos.gestionvehiculos.service.TypeTerrainService;

import java.util.List;

@Controller
@RequestMapping("/api/type-terrain/")
public class TypeTerrainController {

    private final TypeTerrainService service;

    public TypeTerrainController(@Qualifier("typeTerrainServiceImpl") TypeTerrainService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TypeTerrainDTO>> getAllTypeTerrain() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{nameTerrain}")
    public ResponseEntity<TypeTerrainDTO> getTypeTerrainByNameTerrain(@PathVariable String nameTerrain) {
        return ResponseEntity.ok(service.findByNameTerrain(nameTerrain));
    }

    @GetMapping("{id}")
    public ResponseEntity<TypeTerrainDTO> getTypeDocumentById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping()
    public ResponseEntity<TypeTerrainDTO> saveTypeTerrain(@RequestBody TypeTerrainDTO typeTerrainDTO) {
        return ResponseEntity.ok(service.save(typeTerrainDTO));
    }

    @PutMapping
    public ResponseEntity<TypeTerrainDTO> updateTypeDocument(@RequestBody TypeTerrainDTO typeTerrainDTO) {
        if (typeTerrainDTO.getId() != null && service.exists(typeTerrainDTO.getId())) {
            return ResponseEntity.ok(service.save(typeTerrainDTO));
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{nameTerrain}")
    public ResponseEntity<Void> deleteTypeTerrainByNameTerrain(@PathVariable String nameTerrain) {
        if (service.existsByNameTerrain(nameTerrain)) {
            service.deleteByNameTerrain(nameTerrain);
            return  ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTypeTerrainById(@PathVariable Integer id) {
        if (service.exists(id)) {
            service.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
