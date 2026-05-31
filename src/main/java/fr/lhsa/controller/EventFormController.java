package fr.lhsa.controller;

import fr.lhsa.model.Event;
import fr.lhsa.controller.EventsController;
import fr.lhsa.service.DataManager;
import fr.lhsa.service.EventSession;
import fr.lhsa.service.SceneManager;

import javafx.fxml.FXML;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class EventFormController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField locationField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private DatePicker datePicker;

    @FXML
    private DatePicker dateFinPicker;

    @FXML
    public void initialize() {

        editingEvent = EventSession.getSelectedEvent();

        if (editingEvent != null) {

            nameField.setText(editingEvent.getName());

            locationField.setText(editingEvent.getLocation());

            postalCodeField.setText(
                    editingEvent.getCodePostal().toString()
            );

            datePicker.setValue(editingEvent.getDate());

            dateFinPicker.setValue(editingEvent.getDateFin());
        }
    }

    @FXML
    private void saveEvent() {

        if (editingEvent != null) {

            editingEvent.setName(nameField.getText());

            editingEvent.setLocation(locationField.getText());

            editingEvent.setCodePostal(
                    Integer.parseInt(postalCodeField.getText())
            );

            editingEvent.setDate(datePicker.getValue());

            editingEvent.setDateFin(dateFinPicker.getValue());

        } else {

            Event event = new Event(

                    DataManager.getEvents().size() + 1,

                    nameField.getText(),

                    locationField.getText(),

                    Integer.parseInt(postalCodeField.getText()),

                    datePicker.getValue(),

                    dateFinPicker.getValue()
            );

            DataManager.getEvents().add(event);
        }

        EventSession.setSelectedEvent(null);

        SceneManager.loadPage("events.fxml");
    }

    private Event editingEvent;
}