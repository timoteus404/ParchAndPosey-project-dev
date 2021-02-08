package com.example.ParchAndPosey.mapper;

import com.example.ParchAndPosey.entity.Region;
import com.example.ParchAndPosey.service.dto.RegionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RegionMapper extends BaseMapper<Region, RegionDTO>{

    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);
}
