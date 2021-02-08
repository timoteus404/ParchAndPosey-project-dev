package com.example.ParchAndPosey.service;

import com.example.ParchAndPosey.entity.Orders;
import com.example.ParchAndPosey.mapper.OrdersMapper;
import com.example.ParchAndPosey.repository.OrdersRepository;
import com.example.ParchAndPosey.service.dto.OrdersDTO;
import com.example.ParchAndPosey.web.rest.vm.OrdersCreateVM;
import org.springframework.stereotype.Service;

@Service
public class OrdersService extends AbsService<Orders, OrdersDTO, OrdersRepository, OrdersMapper>{

    private final AccountsService service;

    public OrdersService(OrdersRepository repository, OrdersMapper mapper, AccountsService service) {
        super(repository, mapper);
        this.service = service;
    }

    public OrdersDTO create(OrdersCreateVM vm){

        OrdersDTO dto = new OrdersDTO();
        dto.setAccounts(service.getById(vm.getAccounts()));
        dto.setStandardQty(vm.getStandardQty());
        dto.setPosterQty(vm.getPosterQty());
        dto.setGlossyQty(vm.getGlossyQty());
        dto.setTotal(vm.getTotal());
        dto.setDate(vm.getDate());
        dto.setStandardAmountUsd(vm.getStandardAmountUsd());
        dto.setGlossyAmountUsd(vm.getGlossyAmountUsd());
        dto.setPosterAmountUsd(vm.getPosterAmountUsd());
        dto.setTotalAmountUsd(vm.getTotalAmountUsd());
        return create(dto);
    }
}
