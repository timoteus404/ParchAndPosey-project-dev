package com.example.ParchAndPosey.mapper;

import com.example.ParchAndPosey.entity.Orders;
import com.example.ParchAndPosey.service.dto.OrdersDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {AccountsMapper.class})
public interface OrdersMapper extends BaseMapper<Orders, OrdersDTO>{

    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);

}
