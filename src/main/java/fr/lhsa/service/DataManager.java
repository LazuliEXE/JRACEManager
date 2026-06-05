package fr.lhsa.service;

import fr.lhsa.model.Coureur;
import fr.lhsa.model.Event;
import fr.lhsa.model.Race;
import fr.lhsa.model.Registration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static final List<Event> events = new ArrayList<>();

    static {

        /*
         * EVENT
         */

        Event event = new Event(
                1,
                "Trail de la Forêt",
                "Le Havre",
                76600,
                LocalDate.of(2025, 10, 12),
                LocalDate.of(2025, 10, 12)
        );

        /*
         * RACE
         */

        Race race = new Race();

        race.setId(1);

        race.setName("10 KM");

        race.setDistance(10.0);

        race.setDate(LocalDate.of(2025, 10, 12));

        race.setHeureLancement(
                LocalTime.of(10, 0)
        );

        race.setDossardStart(1);

        race.setDossardEnd(500);

        race.setDossardLitigeStart(900);

        race.setDossardLitigeEnd(999);

        race.setNbCoureurParInscription(1);

        race.setEvent(event);

        /*
         * COUREUR
         */

        Coureur coureur = new Coureur();

        coureur.setId(1);

        coureur.setFirstName("Lucas");

        coureur.setLastName("Sieurin");

        /*
         * INSCRIPTION
         */

        Registration registration = new Registration();

        registration.setId(1);

        registration.setCoureur(coureur);

        registration.setRace(race);

        registration.setBibNumber(1);

        registration.setChronoMs(0L);

        /*
         * RELATIONS
         */

        race.getRegistrations().add(registration);

        event.getRaces().add(race);

        events.add(event);
    }

    public static List<Event> getEvents() {
        return events;
    }
}