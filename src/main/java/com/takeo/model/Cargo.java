package com.takeo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cargo {
    @Id
    @GenericGenerator(name="c_id", strategy = "com.takeo.customizeId.CargoIdGen")
    @GeneratedValue(generator = "c_id",strategy = GenerationType.IDENTITY)
    @Column(name="cargo_id")
    private String id;
    @Column(name="cargo_name")
    private String name;
    private String description;
    private int weight;
    @Temporal(TemporalType.DATE)
    private LocalDate pickupDate;
    @Temporal(TemporalType.DATE)
    private LocalDate deliveryDate;

}
