package com.example.storeforcarpartsspring.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "carModel")
public class CarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String brand;

    private String model;

    private int year;
}
