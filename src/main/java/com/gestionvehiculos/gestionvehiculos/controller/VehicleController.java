package com.gestionvehiculos.gestionvehiculos.controller;

import com.gestionvehiculos.gestionvehiculos.domain.VehicleEntity;
import com.gestionvehiculos.gestionvehiculos.service.VehicleService;
import com.gestionvehiculos.gestionvehiculos.service.dto.VehicleDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/vehicle/")
public class VehicleController {

    private final VehicleService service;


    public VehicleController(@Qualifier("VehicleServiceImpl") VehicleService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<VehicleDTO>> getAllVehicle() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<VehicleDTO> getVehicleByPlate(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("plate/{plate}")
    public ResponseEntity<VehicleDTO> getVehicleByPlate(@PathVariable String plate) {
        return ResponseEntity.ok(service.findByPlate(plate));
    }

    @GetMapping("vin/{vin}")
    public ResponseEntity<VehicleDTO> getVehicleByVin(@PathVariable String vin) {
        return ResponseEntity.ok(service.findByPlate(vin));
    }

    @PostMapping()
    public ResponseEntity<VehicleEntity> save(@RequestBody VehicleEntity vehicle) {

        return ResponseEntity.ok(service.save(vehicle));
    }

    @PutMapping
    public ResponseEntity<VehicleEntity> update(@RequestBody VehicleEntity vehicleDTO) {
        if (vehicleDTO.getId() != null && service.exists(vehicleDTO.getId())) {
            return ResponseEntity.ok(service.save(vehicleDTO));
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{intitial}")
    public ResponseEntity<Void> deleteVehicleByPlate(@PathVariable String plate) {
        if (service.existsByPlate(plate)) {
            service.deleteByPlate(plate);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteVehicleById(@PathVariable Integer id) {
        if (service.exists(id)) {
            service.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{vin}")
    public ResponseEntity<Void> deleteVehicleByVin(@PathVariable String vin) {
        if (service.existsByPlate(vin)) {
            service.deleteByPlate(vin);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
