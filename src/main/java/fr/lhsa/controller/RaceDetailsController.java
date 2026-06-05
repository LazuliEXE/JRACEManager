package fr.lhsa.controller;

import fr.lhsa.model.Event;
import fr.lhsa.model.Race;
import fr.lhsa.service.EventSession;
import fr.lhsa.service.RaceSession;
import fr.lhsa.service.SceneManager;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RaceDetailsController {

    @FXML
    private Label raceName;

    @FXML
    private Label raceDistance;

    @FXML
    private Label raceDate;

    @FXML
    private Label raceTime;

    @FXML
    private Label raceNbCoureurs;

    @FXML
    public void initialize() {

        Race race = RaceSession.getSelectedRace();

        if (race != null) {

            raceName.setText(
                    "Nom : " + race.getName()
            );

            raceDistance.setText(
                    "Distance : " + race.getDistance() + " km"
            );

            raceDate.setText(
                    "Date : " + race.getDate()
            );

            raceTime.setText(
                    "Départ : " + race.getHeureLancement()
            );

            raceNbCoureurs.setText(
                    "Coureurs / inscription : "
                            + race.getNbCoureurParInscription()
            );
        }
    }

    @FXML
    private void showRaces() {

        SceneManager.loadPage("races.fxml");
    }

    @FXML
    private void editRace() {

        SceneManager.loadPage("race-form.fxml");
    }

    @FXML
    private void showRegistrations() {

        SceneManager.loadPage("registrations.fxml");
    }

    @FXML
    private void deleteRace() {

        Race race = RaceSession.getSelectedRace();

        Event event = EventSession.getSelectedEvent();

        if (race != null && event != null) {

            event.getRaces().remove(race);

            SceneManager.loadPage("races.fxml");
        }
    }
}