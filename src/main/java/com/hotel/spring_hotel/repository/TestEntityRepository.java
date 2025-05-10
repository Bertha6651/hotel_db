package com.hotel.spring_hotel.repository;


import com.hotel.spring_hotel.entity.testEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestEntityRepository extends JpaRepository<testEntity, Long> {
}