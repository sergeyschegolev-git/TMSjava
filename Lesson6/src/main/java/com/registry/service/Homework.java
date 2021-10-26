package com.registry.service;

import com.registry.models.Address;
import com.registry.models.MilitaryOffice;
import com.registry.models.Recruit;
import com.registry.models.RecruitRegistry;

import java.util.List;
import java.util.Scanner;

public class Homework {
    static RecruitRegistry recruitRegistry = new RecruitRegistry();
    static MilitaryOffice office = new MilitaryOffice(recruitRegistry);

    public static void main(String[] args) {
        runRegistry();
    }

    private static void runRegistry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operation number: ");
        System.out.println("1 - create and add recruit");
        System.out.println("2 - show all recruits");
        System.out.println("3 - show all recruits from Minsk");
        System.out.println("4 - show all recruits from 25 to 27");
        System.out.println("5 - show all recruits with name Alex");
        System.out.println("0 - exit program");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1 -> {
                createRecruit();
                runRegistry();
            }
            case 2 -> {
                System.out.println(getAllPossibleRecruits());
                runRegistry();
            }
            case 3 -> {
                System.out.println(getAllPossibleRecruitsFromCity("Minsk"));
                runRegistry();
            }
            case 4 -> {
                System.out.println(getRecruitsInAgeRange(25, 27));
                runRegistry();
            }
            case 5 -> {
                System.out.println(getAllPossibleRecruitsWithName("Alex"));
                runRegistry();
            }
            default -> {
            }
        }
    }

    private static void createRecruit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter recruit name");
        String recruitName = scanner.next();

        System.out.println("Please enter recruit age");
        int recruitAge = scanner.nextInt();

        System.out.println("Please enter recruit sex");
        String recruitSex = scanner.next();

        System.out.println("Please enter recruit country");
        String recruitCountry = scanner.next();

        System.out.println("Please enter recruit city");
        String recruitCity = scanner.next();

        Address recruitAddress = new Address(recruitCountry, recruitCity);
        Recruit recruit = new Recruit(recruitName, recruitAge, recruitSex, recruitAddress);

        recruitRegistry.getRecruits().add(recruit);
    }

    public static List<Recruit> getAllPossibleRecruits() {
        return office.getPossibleRecruits();
    }

    public static List<Recruit> getAllPossibleRecruitsFromCity(String city) {
        return office.getRecruitsFromSpecificCity(city);
    }

    public static List<Recruit> getAllPossibleRecruitsWithName(String name) {
        return office.getRecruitsWithSpecificName(name);
    }

    public static List<Recruit> getRecruitsInAgeRange(int from, int to) {
        return office.getRecruitsInAgeRange(from, to);
    }
}