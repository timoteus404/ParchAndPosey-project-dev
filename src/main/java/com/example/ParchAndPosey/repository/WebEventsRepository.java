package com.example.ParchAndPosey.repository;

import com.example.ParchAndPosey.entity.WebEvents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebEventsRepository extends JpaRepository<WebEvents, Long> {
}
