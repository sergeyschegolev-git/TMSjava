package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@ToString(callSuper = true)
public class LandTransport extends Transport {
    private int wheelsQuantity;
    private int fuelConsumptionRate;
}
