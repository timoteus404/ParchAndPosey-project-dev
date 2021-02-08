package com.example.ParchAndPosey.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountsDTO implements DTO{

    private Long id;

    private String name;

    private String website;

    private String primaryContactPerson;

    private SalesDTO salesId;
}
