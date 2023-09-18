package com.takeo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    @GenericGenerator(name="d_id",strategy = "com.takeo.customizeId.DriverIdGen")
    @GeneratedValue(generator = "d_id", strategy = GenerationType.IDENTITY)
    private String driverId;
    @Column(name="driver_name")
    private String name;
    private int age;
    private long licenceNum;
}
