package lk.ijse.carHire.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.carHire.business.impl.NewUserBoImpl;
import lk.ijse.carHire.business.custom.NewUserSuper;
import lk.ijse.carHire.dto.NewUserDto;

public class NewUserFormController {
    @FXML
    private TextField confirmPasswordText;

    @FXML
    private TextField createPasswordText;

    @FXML
    private TextField createUserNameText;
    public void btnCreateUserAction(ActionEvent actionEvent){
        String crUserName = createUserNameText.getText();
        String crPassword = createPasswordText.getText();
        String cnfrmPassword = confirmPasswordText.getText();

        NewUserDto newUser = new NewUserDto(crUserName,crPassword,cnfrmPassword);

        NewUserSuper nwUsr = new NewUserBoImpl();
        try {
            boolean isSaved = nwUsr.saveUser(newUser);
            if(isSaved){
                new Alert(Alert.AlertType.CONFIRMATION,"User Created").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }
    }
}
