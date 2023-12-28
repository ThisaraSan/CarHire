package lk.ijse.carHire;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent rootLogin = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene sceneLogin = new Scene(rootLogin);
        stage.setScene(sceneLogin);
        stage.setTitle("CarHire Login");
        stage.centerOnScreen();
        stage.show();



    }
}
