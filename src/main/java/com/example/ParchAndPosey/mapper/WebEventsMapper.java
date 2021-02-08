package com.example.ParchAndPosey.mapper;

import com.example.ParchAndPosey.entity.WebEvents;
import com.example.ParchAndPosey.service.dto.WebEventsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {AccountsMapper.class})
public interface WebEventsMapper extends BaseMapper<WebEvents, WebEventsDTO> {

    WebEventsMapper INSTANCE = Mappers.getMapper(WebEventsMapper.class);

}
