package com.example.ParchAndPosey.service;

import com.example.ParchAndPosey.entity.Accounts;
import com.example.ParchAndPosey.mapper.AccountsMapper;
import com.example.ParchAndPosey.repository.AccountsRepository;
import com.example.ParchAndPosey.service.dto.AccountsDTO;
import com.example.ParchAndPosey.web.rest.vm.AccountsCreateVM;
import org.springframework.stereotype.Service;

@Service
public class AccountsService extends AbsService<Accounts, AccountsDTO, AccountsRepository, AccountsMapper>{

    private final SalesService salesService;

    public AccountsService(AccountsRepository repository, AccountsMapper mapper, SalesService salesService) {
        super(repository, mapper);
        this.salesService = salesService;
    }

    public AccountsDTO create(AccountsCreateVM vm){
        AccountsDTO dto = new AccountsDTO();
        dto.setName(vm.getName());
        dto.setWebsite(vm.getWebsite());
        dto.setPrimaryContactPerson(vm.getPrimaryContactPerson());
        dto.setSalesId(salesService.getById(vm.getSalesId()));
        return create(dto);
    }
}
