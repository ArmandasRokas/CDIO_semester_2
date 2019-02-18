package businesslogic;

import data.dal.IUserDAO;
import data.dto.UserDTO;
import util.PasswordGenerator;

import java.util.List;

public class UserController implements IUserController {
    // lignende metoder som DAO, men ogs[ noget ud over det.

    private IUserDAO userDAO;

    public UserController(IUserDAO userDAO){
        this.userDAO = userDAO;
    }

    public void createUser(int userId, String name, String cpr, List<String> roles){

        // validate ID, if it not exists

        //generere ini
       // PasswordGenerator.generatePass();
        // generare pass


        UserDTO user = new UserDTO(userId, name, "ganerated-ini", cpr, "generated-pass", roles);


        // valideringer på navnet

        try {
            userDAO.createUser(user);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }

    }


    public List<UserDTO> getUserList(){
        try {
            return userDAO.getUserList();
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserDTO getUser(int userId){

        try {
            return userDAO.getUser(userId);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateUser(int userId, String name, String cpr, List<String> roles){

        UserDTO user = new UserDTO(userId, name, "ganerated-ini", cpr, "generated-pass", roles);

    }
}
