package com.example.ParchAndPosey.service.dto;

import com.example.ParchAndPosey.entity.Region;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SalesDTO implements DTO {

    private Long id;

    private String name;

    private RegionDTO region;
}
