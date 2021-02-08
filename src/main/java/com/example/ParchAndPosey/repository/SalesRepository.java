package com.example.ParchAndPosey.repository;

import com.example.ParchAndPosey.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {

}




















//    @Query(value = "FROM sales AS s LEFT JOIN s.region AS r WHERE r.id = ?1")
//    @Query(value = "select new com.example.ParchAndPosey.repository(s.name, s.region_id, r. id)" +
//            "from Sales s LEFT JOIN s.region_id r")
//    Optional<Sales> findAllWithRegionId();
//
//    @Query("select s.regionId, r.id from Sales s join s.regionId r")
//    public String getJoinInformation();