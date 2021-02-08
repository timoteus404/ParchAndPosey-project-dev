package com.example.ParchAndPosey.web.rest;

import com.example.ParchAndPosey.service.AccountsService;
import com.example.ParchAndPosey.service.dto.AccountsDTO;
import com.example.ParchAndPosey.web.rest.vm.AccountsCreateVM;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AccountsResource {

    private final AccountsService service;

    @PostMapping("/accounts")
    public ResponseEntity<AccountsDTO> create(@RequestBody AccountsCreateVM vm){
        return new ResponseEntity<>(service.create(vm), HttpStatus.CREATED);
    }

    @GetMapping("/accounts")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @PutMapping("/accounts/{id}")
    public ResponseEntity<AccountsDTO> update(@RequestBody AccountsDTO accounts, @PathVariable Long id){
        return ResponseEntity.ok(service.update(id, accounts));
    }

    @DeleteMapping("/accounts/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok(Collections.emptyMap());
    }
}
