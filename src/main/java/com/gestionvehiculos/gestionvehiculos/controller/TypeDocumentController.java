package com.gestionvehiculos.gestionvehiculos.controller;

import com.gestionvehiculos.gestionvehiculos.service.TypeDocumentService;
import com.gestionvehiculos.gestionvehiculos.service.dto.TypeDocumentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/typedocument/")
public class TypeDocumentController {

    private final TypeDocumentService service;

    @Autowired
    public TypeDocumentController(@Qualifier("TypeDocumentServiceImpl") TypeDocumentService service) {
        this.service = service;
    }

    @GetMapping("initial/{initial}")
    public ResponseEntity<TypeDocumentDTO> getTypeDocumentByInitial(@PathVariable String initial) {
        return ResponseEntity.ok(service.findByInitials(initial));
    }

    @GetMapping("{id}")
    public ResponseEntity<TypeDocumentDTO> getTypeDocumentById(@PathVariable Integer id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping()
    public ResponseEntity<TypeDocumentDTO> saveTypeDocument(@RequestBody TypeDocumentDTO typeDocument) {
        return ResponseEntity.ok(service.save(typeDocument));
    }

    @PutMapping
    public ResponseEntity<TypeDocumentDTO> updateTypeDocument(@RequestBody TypeDocumentDTO typeDocument) {
        if (typeDocument.getId() != null && service.exists(typeDocument.getId())) {
            return ResponseEntity.ok(service.save(typeDocument));
        }

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{intitial}")
    public ResponseEntity<Void> deleteTypeDocumentByInitial(@PathVariable String intitial) {
        if (service.existsByInitial(intitial)) {
            service.deleteByInitials(intitial);
          return  ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteTypeDocumentById(@PathVariable Integer id) {
        if (service.exists(id)) {
            service.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }
}
