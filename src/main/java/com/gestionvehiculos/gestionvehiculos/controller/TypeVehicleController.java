package com.gestionvehiculos.gestionvehiculos.controller;

import com.gestionvehiculos.gestionvehiculos.service.TypeVehicleService;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeVehicleDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/type-vehicle/")
public class TypeVehicleController {

    private final TypeVehicleService service;


    public TypeVehicleController(@Qualifier("typeVehicleServiceImpl") TypeVehicleService service) {
        this.service = service;
    }

    @GetMapping("{name}")
    public ResponseEntity<TypeVehicleDTO> getTypeVehicleByName(@PathVariable String name) {
        return ResponseEntity.ok(service.findByNameTypeVehicle(name));
    }

    @GetMapping("{id}")
    public ResponseEntity<TypeVehicleDTO> getTypeVehicleById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping()
    public ResponseEntity<TypeVehicleDTO> saveTypeVehicle(@RequestBody TypeVehicleDTO typeVehicleDTO) {
        return ResponseEntity.ok(service.save(typeVehicleDTO));
    }

    @PutMapping
    public ResponseEntity<TypeVehicleDTO> updatetypeVehicleDTO(@RequestBody TypeVehicleDTO typeVehicleDTO) {
        if (typeVehicleDTO.getId() != null && service.existsById(typeVehicleDTO.getId())) {
            return ResponseEntity.ok(service.save(typeVehicleDTO));
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{name}")
    public ResponseEntity<Void> deleteTypeVehicleByName(@PathVariable String name) {
        if (service.existsByNameTypeVehicle(name)) {
            service.deleteByNameTypeVehicle(name);
            return  ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTypeVehicleById(@PathVariable Integer id) {
        if (service.existsById(id)) {
            service.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
