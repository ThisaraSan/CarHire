package lk.ijse.carHire.dao.custom;

import lk.ijse.carHire.dao.SuperDao;
import lk.ijse.carHire.entity.User;

public interface NewUserSuperDao extends SuperDao {
    boolean save(User user) throws Exception;
}
