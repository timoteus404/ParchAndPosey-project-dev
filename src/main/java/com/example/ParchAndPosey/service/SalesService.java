package com.example.ParchAndPosey.service;

import com.example.ParchAndPosey.entity.Sales;
import com.example.ParchAndPosey.mapper.SalesMapper;
import com.example.ParchAndPosey.repository.SalesRepository;
import com.example.ParchAndPosey.service.dto.SalesDTO;
import com.example.ParchAndPosey.web.rest.vm.SalesCreateVM;
import org.springframework.stereotype.Service;

@Service
public class SalesService extends AbsService<Sales, SalesDTO, SalesRepository, SalesMapper>{

    private final RegionService regionService;

    public SalesService(SalesRepository repository, SalesMapper mapper, RegionService regionService) {
        super(repository, mapper);
        this.regionService = regionService;
    }

    public SalesDTO create(SalesCreateVM vm){
        SalesDTO dto = new SalesDTO();
        dto.setName(vm.getName());
        dto.setRegion(regionService.getById(vm.getRegionId()));
        return create(dto);
    }

    public SalesDTO update(Long id, SalesCreateVM vm){
        SalesDTO dto = new SalesDTO();
        dto.setId(id);
        dto.setName(vm.getName());
        dto.setRegion(regionService.getById(vm.getRegionId()));
        return create(dto);
    }

}
