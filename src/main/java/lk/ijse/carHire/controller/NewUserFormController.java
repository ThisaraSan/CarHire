package lk.ijse.carHire.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lk.ijse.carHire.business.BoFactory;
import lk.ijse.carHire.business.BoType;
import lk.ijse.carHire.business.custom.NewUserSuper;
import lk.ijse.carHire.dto.NewUserDto;

public class NewUserFormController {

    @FXML
    private TextField createPasswordText;

    @FXML
    private TextField createUserNameText;
    public void btnCreateUserAction(ActionEvent actionEvent){
        String crUserName = createUserNameText.getText();
        String crPassword = createPasswordText.getText();

        NewUserDto newUser = new NewUserDto(crUserName,crPassword);

        NewUserSuper nwUsr = BoFactory.getBo(BoType.NEWUSER);
        try {
            boolean isSaved = nwUsr.saveUser(newUser);
            if(isSaved){
                new Alert(Alert.AlertType.CONFIRMATION,"User Created Successfully.").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }


}
