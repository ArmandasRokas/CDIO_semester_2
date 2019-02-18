package businesslogic;

import data.dal.IUserDAO;
import data.dto.UserDTO;

import java.util.List;

public class UserController implements IUserController {
    // lignende metoder som DAO, men ogs[ noget ud over det.

    private IUserDAO userDAO;

    public UserController(IUserDAO userDAO){
        this.userDAO = userDAO;
    }

    public void createUser(int id, String name, List<String> roles, String cpr){



        // valideringer på navnet

        try {
            userDAO.createUser(new UserDTO());
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }

    }
}
