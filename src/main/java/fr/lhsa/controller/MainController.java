package fr.lhsa.controller;

import fr.lhsa.service.SceneManager;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class MainController {

    @FXML
    private StackPane contentArea;

    @FXML
    public void initialize() {

        SceneManager.setContentArea(contentArea);

        SceneManager.loadPage("dashboard.fxml");
    }

    @FXML
    private void showDashboard() {
        SceneManager.loadPage("dashboard.fxml");
    }

    @FXML
    private void showEvents() {
        SceneManager.loadPage("events.fxml");
    }

    @FXML
    private void showCourses() {
        SceneManager.loadPage("courses.fxml");
    }

    @FXML
    private void showCoureurs() {
        SceneManager.loadPage("coureurs.fxml");
    }

    @FXML
    private void showRegistrations() {
        SceneManager.loadPage("registrations.fxml");
    }
}