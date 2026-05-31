package fr.lhsa.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class SceneManager {

    private static StackPane contentArea;

    public static void setContentArea(StackPane contentPane) {
        contentArea = contentPane;
    }

    public static void loadPage(String fxml) {

        try {

            Parent page = FXMLLoader.load(
                    SceneManager.class.getResource("/view/" + fxml)
            );

            contentArea.getChildren().clear();
            contentArea.getChildren().add(page);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}