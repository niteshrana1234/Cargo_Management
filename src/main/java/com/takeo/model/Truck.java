package com.takeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Truck {
    private int truckId;
    private int licencePlateNum;
    private String make;
    private String model;
}
