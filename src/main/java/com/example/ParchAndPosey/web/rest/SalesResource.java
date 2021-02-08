package com.example.ParchAndPosey.web.rest;

import com.example.ParchAndPosey.service.SalesService;
import com.example.ParchAndPosey.service.dto.SalesDTO;
import com.example.ParchAndPosey.web.rest.vm.SalesCreateVM;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SalesResource {

    private final SalesService service;

    @PostMapping("/sales")
    public ResponseEntity<SalesDTO> create(@RequestBody SalesCreateVM vm){
        return new ResponseEntity<>(service.create(vm), HttpStatus.CREATED);
    }

    @GetMapping("/sales")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/sales/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    //Put query is not working
    //Needs to be revised
    @PutMapping("/sales/{id}")
    public ResponseEntity<SalesDTO> update(@RequestBody SalesDTO salesRep, @PathVariable Long id){
        return ResponseEntity.ok(service.update(id, salesRep));
    }

    @DeleteMapping("/sales/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok(Collections.emptyMap());
    }
}
