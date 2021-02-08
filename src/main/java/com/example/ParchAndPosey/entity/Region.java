package com.example.ParchAndPosey.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "region")
public class Region extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "region",
            cascade = CascadeType.ALL)
    private List<Sales> salesRep;

}
