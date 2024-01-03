package lk.ijse.carHire.business.impl;

import javafx.scene.control.Alert;
import lk.ijse.carHire.business.custom.NewUserSuper;
import lk.ijse.carHire.dao.custom.NewUserSuperDao;
import lk.ijse.carHire.dao.impl.NewUserDaoImpl;
import lk.ijse.carHire.dto.NewUserDto;
import lk.ijse.carHire.entity.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class NewUserBoImpl implements NewUserSuper {

    @Override
    public boolean saveUser(NewUserDto newUserDto) throws Exception {

        String crUsrName = newUserDto.getCrUserName();
        String crUsrPswrd = newUserDto.getCrUserPassword();

        //password taken from the textfield convert to hashed password.
        String hashedPswrd = hashPasswordMD5(crUsrPswrd);

        User user = new User(crUsrName,hashedPswrd);

        NewUserSuperDao nwUser = new NewUserDaoImpl();
        boolean isSaved = nwUser.save(user);
        return isSaved;
    }

    private static String hashPasswordMD5(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashedPasswordBytes = md.digest(password.getBytes());

            // Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashedPasswordBytes) {
                String hex = Integer.toHexString(0xFF & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
            return null;
        }
    }
}
