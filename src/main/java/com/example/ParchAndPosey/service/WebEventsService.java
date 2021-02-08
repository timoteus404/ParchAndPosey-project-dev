package com.example.ParchAndPosey.service;

import com.example.ParchAndPosey.entity.WebEvents;
import com.example.ParchAndPosey.mapper.WebEventsMapper;
import com.example.ParchAndPosey.repository.WebEventsRepository;
import com.example.ParchAndPosey.service.dto.WebEventsDTO;
import com.example.ParchAndPosey.web.rest.vm.WebEventsCreateVM;
import org.springframework.stereotype.Service;

@Service
public class WebEventsService extends AbsService<WebEvents, WebEventsDTO, WebEventsRepository, WebEventsMapper>{

    private final AccountsService accountService;

    public WebEventsService(WebEventsRepository repository, WebEventsMapper mapper, AccountsService accountService) {
        super(repository, mapper);
        this.accountService = accountService;
    }

    public WebEventsDTO create(WebEventsCreateVM vm){
        WebEventsDTO dto = new WebEventsDTO();
        dto.setAccount(accountService.getById(vm.getAccount()));
        dto.setDate(vm.getDate());
        dto.setChannel(vm.getChannel());
        return create(dto);
    }
}
