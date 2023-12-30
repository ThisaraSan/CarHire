package lk.ijse.carHire.dao.custom;

import lk.ijse.carHire.entity.User;

public interface NewUserSuperDao {
    boolean save(User user) throws Exception;
}
