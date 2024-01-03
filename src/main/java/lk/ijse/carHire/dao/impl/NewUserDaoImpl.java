package lk.ijse.carHire.dao.impl;

import javafx.scene.control.Alert;
import lk.ijse.carHire.dao.custom.NewUserSuperDao;
import lk.ijse.carHire.db.DbConnection;
import lk.ijse.carHire.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class NewUserDaoImpl implements NewUserSuperDao {
    @Override
    public boolean save(User user) throws Exception {

        String usernameToCheck = user.getName();

        Connection connection = DbConnection.getInstance().getConnection();
        String selectQuery = "SELECT name FROM user WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        preparedStatement.setString(1, usernameToCheck);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            // Username already exists
            new Alert(Alert.AlertType.ERROR,"Username already exists. Try again.").show();
            return false;
        } else{
            Connection conection = DbConnection.getInstance().getConnection();
            String sql = "INSERT INTO user VALUES (?,?)";
            PreparedStatement prstmnt = conection.prepareStatement(sql);
            prstmnt.setString(1,user.getName());
            prstmnt.setString(2,user.getPassword());

            int affctdRows = prstmnt.executeUpdate();
            return affctdRows > 0;
        }



    }
}
