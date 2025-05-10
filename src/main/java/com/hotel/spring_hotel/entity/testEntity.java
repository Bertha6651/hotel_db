package com.hotel.spring_hotel.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class testEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
