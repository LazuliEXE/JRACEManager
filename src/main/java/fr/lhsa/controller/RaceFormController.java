package fr.lhsa.controller;

import fr.lhsa.model.Event;
import fr.lhsa.model.Race;
import fr.lhsa.service.EventSession;
import fr.lhsa.service.SceneManager;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalTime;

public class RaceFormController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField distanceField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField timeField;

    @FXML
    private void saveRace() {

        Event event = EventSession.getSelectedEvent();

        if (event == null) {
            return;
        }

        Race race = new Race();

        race.setId(event.getRaces().size() + 1);

        race.setName(nameField.getText());

        race.setDistance(
                Double.parseDouble(distanceField.getText())
        );

        race.setDate(datePicker.getValue());

        race.setHeureLancement(
                LocalTime.parse(timeField.getText())
        );

        race.setEvent(event);

        event.getRaces().add(race);

        SceneManager.loadPage("races.fxml");
    }
}