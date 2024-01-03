package lk.ijse.carHire.business;

import lk.ijse.carHire.business.impl.NewUserBoImpl;

public class BoFactory {
    public static <T extends SuperBo>T getBo(BoType type){
        switch (type){
            case NEWUSER:
                return (T) new NewUserBoImpl();
            default:
                return null;
        }
    }
}
