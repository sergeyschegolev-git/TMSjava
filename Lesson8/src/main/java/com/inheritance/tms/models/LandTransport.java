package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
public class LandTransport extends Transport {
    private int wheelsQuantity;
    private int fuelConsumptionRate;
}
