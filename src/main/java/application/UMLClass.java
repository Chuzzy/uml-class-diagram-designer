package application;

import java.io.IOException;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class UMLClass extends VBox {

    @FXML
    private Label classNameLabel;

    public UMLClass() {
        FXMLLoader loader = new FXMLLoader(UMLClass.class.getResource("UMLCLass.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public StringProperty classNameProperty() {
        return classNameLabel.textProperty();
    }

    public String getClassName() {
        return classNameProperty().get();
    }

    public void setClassName(String className) {
        classNameProperty().set(className);
    }

}
