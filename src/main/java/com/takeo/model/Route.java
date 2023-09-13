package com.takeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
    private String initialAddress;
    private String destinationAddress;
    private Date departureDate;
    private Date ArrivalDate;
}
