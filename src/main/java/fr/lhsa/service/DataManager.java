package fr.lhsa.service;

import fr.lhsa.model.Coureur;
import fr.lhsa.model.Event;
import fr.lhsa.model.Race;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static final List<Event> events = new ArrayList<>();

    static {

        Event event = new Event();
        event.setId(1);
        event.setName("Trail de la Forêt");
        event.setDate(LocalDate.of(2025, 10, 12));

        Race race = new Race();
        race.setId(1);
        race.setName("10 KM");
        race.setDistance(10);

        Coureur coureur = new Coureur();
        coureur.setId(1);
        coureur.setFirstName("Lucas");
        coureur.setLastName("Sieurin");

        race.getCoureurs().add(coureur);

        event.getRaces().add(race);

        events.add(event);
    }

    public static List<Event> getEvents() {
        return events;
    }
}