package fr.lhsa.controller;

import fr.lhsa.model.Event;
import fr.lhsa.model.Race;
import fr.lhsa.service.EventSession;
import fr.lhsa.service.RaceSession;
import fr.lhsa.service.SceneManager;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;

public class RacesController {

    @FXML
    private TableView<Race> raceTable;

    @FXML
    private TableColumn<Race, Integer> idColumn;

    @FXML
    private TableColumn<Race, String> nameColumn;

    @FXML
    public void initialize() {

        idColumn.setCellValueFactory(
                new PropertyValueFactory<>("id")
        );

        nameColumn.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );

        Event event = EventSession.getSelectedEvent();

        if (event != null) {

            raceTable.setItems(
                    FXCollections.observableArrayList(
                            event.getRaces()
                    )
            );
        }

        raceTable.setOnMouseClicked(eventClick -> {

            if (eventClick.getClickCount() == 2) {

                Race selectedRace =
                        raceTable.getSelectionModel().getSelectedItem();

                if (selectedRace != null) {

                    RaceSession.setSelectedRace(selectedRace);

                    SceneManager.loadPage("race-details.fxml");
                }
            }
        });
    }

    @FXML
    private void showCreateRace() {

        RaceSession.setSelectedRace(null);

        SceneManager.loadPage("race-form.fxml");
    }
}