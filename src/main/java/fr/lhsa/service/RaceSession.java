package fr.lhsa.service;

import fr.lhsa.model.Race;

public class RaceSession {

    private static Race selectedRace;

    public static Race getSelectedRace() {
        return selectedRace;
    }

    public static void setSelectedRace(Race race) {
        selectedRace = race;
    }
}