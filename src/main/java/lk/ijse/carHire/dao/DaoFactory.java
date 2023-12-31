package lk.ijse.carHire.dao;

import lk.ijse.carHire.dao.impl.NewUserDaoImpl;

public class DaoFactory {
    public static <T extends SuperDao>T getDao(DaoType type){
        switch (type){
            case NEWUSER :
                return (T) new NewUserDaoImpl();

            default:
                return null;
        }
    }
}
