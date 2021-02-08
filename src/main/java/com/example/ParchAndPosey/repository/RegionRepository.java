package com.example.ParchAndPosey.repository;

import com.example.ParchAndPosey.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

//    Optional<Region> findByName(String region);

}
