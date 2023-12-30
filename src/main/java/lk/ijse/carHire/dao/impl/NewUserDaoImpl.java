package lk.ijse.carHire.dao.impl;

import lk.ijse.carHire.dao.custom.NewUserSuperDao;
import lk.ijse.carHire.db.DbConnection;
import lk.ijse.carHire.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class NewUserDaoImpl implements NewUserSuperDao {
    @Override
    public boolean save(User user) throws Exception {
        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "INSERT INTO user VALUES (?,?)";
        PreparedStatement prstmnt = connection.prepareStatement(sql);
        prstmnt.setString(1,user.getName());
        prstmnt.setString(2,user.getPassword());

        int affctdRows = prstmnt.executeUpdate();
        return affctdRows > 0;
    }
}
