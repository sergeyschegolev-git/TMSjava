package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class AirTransport extends Transport {
    private int wingSpan;
    private int minLandingStrip;
}
