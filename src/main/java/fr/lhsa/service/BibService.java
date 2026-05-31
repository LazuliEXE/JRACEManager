package fr.lhsa.service;

import fr.lhsa.model.Registration;

import java.util.ArrayList;
import java.util.List;

public class BibService {

    private static final List<Integer> usedNumbers = new ArrayList<>();

    public static int generateDossard() {

        int number = 1;

        while (usedNumbers.contains(number)) {
            number++;
        }

        usedNumbers.add(number);

        return number;
    }

    public static void releaseDossard(int number) {

        usedNumbers.remove(Integer.valueOf(number));
    }
}