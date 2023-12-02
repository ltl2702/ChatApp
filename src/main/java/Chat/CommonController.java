package Chat;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class CommonController {
    public static void switchScene(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(CommonController.class.getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stageMain.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
