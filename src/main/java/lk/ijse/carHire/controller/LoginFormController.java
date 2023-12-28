package lk.ijse.carHire.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public void btnCreateUserAction(ActionEvent actionEvent) throws IOException {
        //open the Create a New User UI
        Parent rootCreateNewUser = FXMLLoader.load(this.getClass().getResource("/view/new_user_form.fxml"));

        Scene scene = new Scene(rootCreateNewUser);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
