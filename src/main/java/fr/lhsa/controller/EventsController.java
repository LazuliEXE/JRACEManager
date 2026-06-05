package fr.lhsa.controller;

import fr.lhsa.model.Event;
import fr.lhsa.service.DataManager;
import fr.lhsa.service.EventSession;
import fr.lhsa.service.SceneManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class EventsController {

    @FXML
    private TableView<Event> eventTable;

    @FXML
    private TableColumn<Event, Integer> idColumn;

    @FXML
    private TableColumn<Event, String> nameColumn;

    @FXML
    private TableColumn<Event, LocalDate> dateColumn;

    @FXML
    public void initialize() {

        /*
         * Configuration des colonnes
         */

        idColumn.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );

        dateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date")
        );

        refreshTable();

        /*
         * Double clic sur un événement
         */

        eventTable.setOnMouseClicked(event -> {

            if (event.getClickCount() == 2) {

                Event selectedEvent =
                        eventTable.getSelectionModel().getSelectedItem();

                if (selectedEvent != null) {

                    EventSession.setSelectedEvent(selectedEvent);

                    SceneManager.loadPage("event-details.fxml");
                }
            }
        });
    }

    private void refreshTable() {

        ObservableList<Event> events =
                FXCollections.observableArrayList(
                        DataManager.getEvents()
                );

        eventTable.setItems(events);
    }

    @FXML
    private void showCreateEvent() {

        SceneManager.loadPage("event-form.fxml");
    }

    @FXML
    private void deleteEvent() {

        Event selectedEvent =
                eventTable.getSelectionModel().getSelectedItem();

        if (selectedEvent != null) {

            DataManager.getEvents().remove(selectedEvent);

            refreshTable();
        }
    }
}