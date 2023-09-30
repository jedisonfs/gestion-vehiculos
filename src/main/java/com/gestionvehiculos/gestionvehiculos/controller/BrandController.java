package com.gestionvehiculos.gestionvehiculos.controller;

import com.gestionvehiculos.gestionvehiculos.service.BrandService;
import com.gestionvehiculos.gestionvehiculos.service.dto.BrandDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/brand/")
public class BrandController {

    private final BrandService service;

    @Autowired
    public BrandController(@Qualifier("BrandServiceImpl") BrandService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<BrandDTO> getBrandById(@PathVariable Integer id) {
        if (id != null) {
            return ResponseEntity.ok(service.findById(id));
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("{brandName}")
    public ResponseEntity<BrandDTO> getBrandByBrandName(@PathVariable String brandName) {
        if (brandName != null) {
            return ResponseEntity.ok(service.findByBrandName(brandName));
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity<BrandDTO> save(@RequestBody BrandDTO brandDTO) {
        if (!service.exists(brandDTO.getId())) {
            return ResponseEntity.ok(service.save(brandDTO));
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping
    public ResponseEntity<BrandDTO> updateBrand(@RequestBody BrandDTO brandDTO) {
        if (brandDTO.getId() != null || service.exists(brandDTO.getId())) {
            return ResponseEntity.ok(service.save(brandDTO));
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

    @DeleteMapping("{brandName}")
    public ResponseEntity<Void> deleteById(@PathVariable String brandName) {
        if (brandName != null || service.existsByBrandName(brandName)) {
            service.deleteByBrandName(brandName);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

}
