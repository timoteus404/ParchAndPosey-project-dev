package com.example.ParchAndPosey.service;

import com.example.ParchAndPosey.entity.Region;
import com.example.ParchAndPosey.repository.RegionRepository;
import com.example.ParchAndPosey.service.dto.RegionDTO;
import com.example.ParchAndPosey.mapper.RegionMapper;
import org.springframework.stereotype.Service;

@Service
public class RegionService extends AbsService<Region, RegionDTO, RegionRepository, RegionMapper>{


    protected RegionService(RegionRepository repository, RegionMapper mapper) {
        super(repository, mapper);
    }
}
