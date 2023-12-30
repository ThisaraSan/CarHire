package lk.ijse.carHire.business.impl;

import lk.ijse.carHire.business.custom.NewUserSuper;
import lk.ijse.carHire.dao.custom.NewUserSuperDao;
import lk.ijse.carHire.dao.impl.NewUserDaoImpl;
import lk.ijse.carHire.dto.NewUserDto;
import lk.ijse.carHire.entity.User;


public class NewUserBoImpl implements NewUserSuper {

    @Override
    public boolean saveUser(NewUserDto newUserDto) throws Exception {
        String crUsrName = newUserDto.getCrUserName();
        String crUsrPswrd = newUserDto.getCrUserPassword();

        User user = new User(crUsrName,crUsrPswrd);

        NewUserSuperDao nwUser = new NewUserDaoImpl();
        boolean isSaved = nwUser.save(user);
        return isSaved;
    }
}
