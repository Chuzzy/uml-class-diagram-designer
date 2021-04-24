package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;

public class OperationList extends VBox {
    
    
    public OperationList() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("OperationList.fxml"));
        loader.setRoot(this);
        loader.setController(this);

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
