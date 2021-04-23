package application;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void exitApp() {
        System.out.println("Exiting app...");
        Platform.exit();
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
