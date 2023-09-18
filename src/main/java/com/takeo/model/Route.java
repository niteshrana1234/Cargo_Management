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
public class Route {
    @Id
    @GenericGenerator(name="r_id", strategy = "com.takeo.customizeId.RouteIdGen")
    @GeneratedValue(generator = "r_id",strategy = GenerationType.IDENTITY)
    private String routeId;
    private String initialAddress;
    private String destinationAddress;
    @Temporal(TemporalType.DATE)
    private LocalDate departureDate;
    @Temporal(TemporalType.DATE)
    private LocalDate arrivalDate;
}
