package fr.lhsa.controller;

import fr.lhsa.model.Event;
import fr.lhsa.service.DataManager;
import fr.lhsa.service.EventSession;

import fr.lhsa.service.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EventDetailsController {

    @FXML
    private Label eventName;

    @FXML
    private Label eventDate;

    @FXML
    public void initialize() {

        Event event = EventSession.getSelectedEvent();

        if (event != null) {

            eventName.setText(event.getName());

            eventDate.setText(
                    event.getDate().toString()
            );
        }
    }

    @FXML
    private void deleteEvent() {

        Event event = EventSession.getSelectedEvent();

        if (event != null) {

            DataManager.getEvents().remove(event);

            SceneManager.loadPage("events.fxml");
        }
    }

    @FXML
    private void editEvent() {

        SceneManager.loadPage("event-form.fxml");
    }
}