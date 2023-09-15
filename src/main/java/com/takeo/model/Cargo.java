package com.takeo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cargo_id")
    private int id;
    @Column(name="cargo_name")
    private String name;
    private String description;
    private int weight;
    private Date pickupDate;
    private Date deliveryDate;

}
