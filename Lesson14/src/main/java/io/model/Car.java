package io.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Builder
public class Car implements Serializable {
    private final String mark;
    private final String engine;
    private final Integer speed;
    private final Integer price;
}
