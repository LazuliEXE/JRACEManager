package fr.lhsa.controller;

import fr.lhsa.model.Event;
import fr.lhsa.service.DataManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DashboardController {

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

        idColumn.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );

        dateColumn.setCellValueFactory(
                new PropertyValueFactory<>("date")
        );

        ObservableList<Event> events = FXCollections.observableArrayList(
                DataManager.getEvents()
        );

        eventTable.setItems(events);
    }
}