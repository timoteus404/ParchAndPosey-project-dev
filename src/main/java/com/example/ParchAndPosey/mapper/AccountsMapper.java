package com.example.ParchAndPosey.mapper;

import com.example.ParchAndPosey.entity.Accounts;
import com.example.ParchAndPosey.service.dto.AccountsDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {SalesMapper.class})
public interface AccountsMapper extends BaseMapper<Accounts, AccountsDTO>{
    AccountsMapper INSTANCE = Mappers.getMapper(AccountsMapper.class);
}
