package application;

import java.io.IOException;

import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import uml.Class;

public class UMLClass extends VBox {

    private Class _class;

    @FXML
    private Label classNameLabel;
    @FXML
    private VBox attributeList;
    @FXML
    private VBox operationList;

    public UMLClass() {
        FXMLLoader loader = new FXMLLoader(UMLClass.class.getResource("UMLClass.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        _class = new Class();
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

    @FXML
    private void onClickAttribute(MouseEvent me) {
        Label source = (Label) me.getSource();
        System.out.println("Attribute clicked: " + source.getText());
    }
}
