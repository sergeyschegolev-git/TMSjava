package com.registry.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class RecruitRegistry {
    private final List<Recruit> recruits = new ArrayList<>();
}
