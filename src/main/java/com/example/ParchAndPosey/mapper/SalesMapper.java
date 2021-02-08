package com.example.ParchAndPosey.mapper;

import com.example.ParchAndPosey.entity.Sales;
import com.example.ParchAndPosey.service.dto.SalesDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {RegionMapper.class})
public interface SalesMapper extends BaseMapper<Sales, SalesDTO>{

    SalesMapper INSTANCE = Mappers.getMapper(SalesMapper.class);
}

