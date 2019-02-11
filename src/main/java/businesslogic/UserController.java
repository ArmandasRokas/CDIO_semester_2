package businesslogic;

import data.dao.IUserDAO;
import data.dto.UserDTO;

public class UserController implements IUserController {
    // lignende metoder som DAO, men ogs[ noget ud over det.

    IUserDAO userDAO;
    UserController(IUserDAO userDAO){
        this.userDAO = userDAO;
    }

    public void createUser(String name){

        // valideringer på navnet

        try {
            userDAO.createUser(new UserDTO());
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }

    }
}
