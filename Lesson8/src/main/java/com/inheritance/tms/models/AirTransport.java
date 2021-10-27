package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class AirTransport extends Transport {
    private int wingSpan;
    private int minLandingStrip;
}
