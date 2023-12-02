package Chat;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Controllers extends CommonController {

    @FXML
    void backToChat(MouseEvent event) throws IOException {
        switchScene("/fxml/chat.fxml");
    }

    @FXML
    void backToMain(MouseEvent event) {
        switchScene("/fxml/main.fxml");
    }

    @FXML
    void intoCall(MouseEvent event) throws IOException {
        switchScene("/fxml/call.fxml");
    }
    @FXML
    void intoChat(MouseEvent event) throws IOException {
        CommonController.switchScene("/fxml/chat.fxml");
    }
}
