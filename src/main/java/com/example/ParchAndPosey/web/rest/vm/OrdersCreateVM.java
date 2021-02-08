package com.example.ParchAndPosey.web.rest.vm;

import lombok.Data;

@Data
public class OrdersCreateVM {

    private Long accounts;
    private Integer standardQty;
    private Integer posterQty;
    private Integer glossyQty;
    private Integer total;
    private String date;
    private Double standardAmountUsd;
    private Double glossyAmountUsd;
    private Double posterAmountUsd;
    private Double totalAmountUsd;
}
