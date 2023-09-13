package com.takeo.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    private Long id;
    private String name;
    private String description;
    private double weight;
    private double volume;
    private Date pickupDate;
    private Date deliveryDate;

}
