package lk.ijse.carHire.business.custom;

import lk.ijse.carHire.business.SuperBo;
import lk.ijse.carHire.dto.NewUserDto;

public interface NewUserSuper extends SuperBo {
    public boolean saveUser(NewUserDto newUserDto) throws Exception;
}
