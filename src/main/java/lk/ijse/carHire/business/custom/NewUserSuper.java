package lk.ijse.carHire.business.custom;

import lk.ijse.carHire.dto.NewUserDto;

public interface NewUserSuper {
    public boolean saveUser(NewUserDto newUserDto) throws Exception;
}
