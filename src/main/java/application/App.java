package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The application bootloader.
 */
public class App extends Application {

    private static Scene scene;

    /**
     * Starts the application.
     * 
     * @param stage the primary stage
     * @throws IOException if the main editor scene FXML file cannot be loaded
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Sets the rooot of the current scene.
     * 
     * @param fxml the name of the FXML file
     * @throws IOException if the FXML file can't be loaded
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads an object heirarchy from a FXML file.
     * 
     * @param fxml the name of the FXML file
     * @return the root node of the object heirarchy
     * @throws IOException if the file could not be loaded
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Runs the application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch();
    }

}