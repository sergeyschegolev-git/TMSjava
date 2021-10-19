package com.registry.models;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class MilitaryOffice {
    private RecruitRegistry recruitRegistry;

    public List<Recruit> getRecruitsWithSpecificName(String name) {
        List<Recruit> recruits = getPossibleRecruits();
        List<Recruit> result = new ArrayList<>();

        for(Recruit recruit: recruits) {
            if (recruit.getName().equals(name)) {
                result.add(recruit);
            }
        }
        return result;
    }

    public List<Recruit> getRecruitsFromSpecificCity(String city) {
        List<Recruit> recruits = getPossibleRecruits();
        List<Recruit> result = new ArrayList<>();

        for(Recruit recruit: recruits) {
            if (recruit.getAddress().getCity().equals(city)) {
                result.add(recruit);
            }
        }
        return result;
    }

    public List<Recruit> getPossibleRecruits() {
        List<Recruit> recruits = getRecruitsInAgeRange(18, 27);
        List<Recruit> result = new ArrayList<>();

        for(Recruit recruit: recruits) {
            String sex = recruit.getSex();

            if (sex.equals("male")) {
                result.add(recruit);
            }
        }
        return result;
    }

    public List<Recruit> getRecruitsInAgeRange(int from, int to) {
        List<Recruit> recruits = recruitRegistry.getRecruits();
        List<Recruit> result = new ArrayList<>();

        for(Recruit recruit: recruits) {
            int age = recruit.getAge();

            if (age >= from && age < to) {
                result.add(recruit);
            }
        }
        return result;
    }
}
