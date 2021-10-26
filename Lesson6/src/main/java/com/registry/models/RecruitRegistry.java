package com.registry.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class RecruitRegistry {
    @Getter(lazy = true)
    private final List<Recruit> recruits = new ArrayList<>();
}
