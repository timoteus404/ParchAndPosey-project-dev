package com.example.ParchAndPosey.web.rest;

import com.example.ParchAndPosey.service.RegionService;
import com.example.ParchAndPosey.service.dto.RegionDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RegionResource {

    private final RegionService service;

    //TODO getById
    //CRUD
    @PostMapping("/region")
    public ResponseEntity<RegionDTO> create(@RequestBody RegionDTO user){
        return new ResponseEntity<>(service.create(user), HttpStatus.CREATED);
    }

    @GetMapping("/region")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/region/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/region/{id}")
    public ResponseEntity<RegionDTO> update(@RequestBody RegionDTO region, @PathVariable Long id){
        return ResponseEntity.ok(service.update(id, region));
    }

    @DeleteMapping("/region/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok(Collections.emptyMap());
    }

}
