package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class AttributeList extends VBox {
    

    public AttributeList() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AttributeList.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
