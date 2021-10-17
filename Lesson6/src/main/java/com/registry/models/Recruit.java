package com.registry.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Recruit {
    private String name;
    private int age;
    private String sex;
    private Address address;

    @Override
    public String toString() {
        return "Recruit{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address=" + address +
                '}';
    }
}
