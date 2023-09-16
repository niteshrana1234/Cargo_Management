package com.takeo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int routeId;
    private String initialAddress;
    private String destinationAddress;
    @Temporal(TemporalType.DATE)
    private LocalDate departureDate;
    @Temporal(TemporalType.DATE)
    private LocalDate arrivalDate;
}
