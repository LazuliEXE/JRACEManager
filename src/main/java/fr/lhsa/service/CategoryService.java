package fr.lhsa.service;

import fr.lhsa.model.Category;

import java.time.LocalDate;

public class CategoryService {

    public static Category calculateCategory(LocalDate birthDate) {

        LocalDate now = LocalDate.now();

        int seasonYear;

        if (now.getMonthValue() >= 9) {
            seasonYear = now.getYear() + 1;
        } else {
            seasonYear = now.getYear();
        }

        int age = seasonYear - birthDate.getYear();

        if (age <= 9) return Category.EA;

        if (age <= 11) return Category.PO;

        if (age <= 13) return Category.BE;

        if (age <= 15) return Category.MI;

        if (age <= 17) return Category.CA;

        if (age <= 19) return Category.JU;

        if (age <= 22) return Category.ES;

        if (age <= 34) return Category.SE;

        if (age <= 39) return Category.M0;

        if (age <= 44) return Category.M1;

        if (age <= 49) return Category.M2;

        if (age <= 54) return Category.M3;

        if (age <= 59) return Category.M4;

        if (age <= 64) return Category.M5;

        if (age <= 69) return Category.M6;

        if (age <= 74) return Category.M7;

        if (age <= 79) return Category.M8;

        if (age <= 84) return Category.M9;

        return Category.M10;
    }
}