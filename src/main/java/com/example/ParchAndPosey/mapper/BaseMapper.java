package com.example.ParchAndPosey.mapper;

import java.util.List;

public interface BaseMapper <E, D>{

    D toDto(E entity);
    E fromDto(D dto);

    List<D> toDto(List<E> entities);
    List<E> fromDto(List<D> dto);
}
