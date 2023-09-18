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
public class Truck {
    @Id
    @GenericGenerator(name="t_id", strategy="com.takeo.customizeId.TruckIdGen")
    @GeneratedValue(generator="t_id" ,strategy = GenerationType.IDENTITY)
    private String truckId;
    @Column(name="plate_num")
    private int licencePlateNum;
    private String make;
    private String model;
}
