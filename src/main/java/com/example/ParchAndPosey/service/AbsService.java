package com.example.ParchAndPosey.service;

import com.example.ParchAndPosey.entity.BaseEntity;
import com.example.ParchAndPosey.mapper.BaseMapper;
import com.example.ParchAndPosey.service.dto.DTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbsService<E extends BaseEntity, D extends DTO, R extends JpaRepository<E, Long>, M extends BaseMapper<E, D>> {

    protected final R repository;
    protected final M mapper;

    public AbsService(R repository, M mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    //TODO CRUD

    public D create(D dto){

        return mapper.toDto(repository.save(mapper.fromDto(dto)));
    }

    public List<D> getAll(){
        return mapper.toDto(repository.findAll());
    }

    public D getById(Long id){
        return mapper.toDto(repository.findById(id).orElseThrow(()-> new RuntimeException("ID not found")));
    }

    public D update(Long id, D dto){
        if(id == null){
            throw new RuntimeException("ID not found");
        }else{
            E e = mapper.fromDto(dto);
            e.setId(id);
            return mapper.toDto(repository.save(e));
        }
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
