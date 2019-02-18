package BusinessLogic;

import DataAccess.IUserDAO;
import DataAccess.UserDTO;

import java.util.List;

public class UserObject {
    private IUserDAO user;

    public UserObject(IUserDAO u) {
        user = u;
    }

    public void createUser(int userID, String userName, String ini, String cpr, String password, String roles){
        user.createUser(userID, userName, ini, cpr, password, roles);
    }

    public void updateUser(int userID, String userName, String ini, String cpr, String password, String roles){
        user.updateUser(userID, userName, ini, cpr, password, roles);
    }

    public void deleteUser(int id){
        user.deleteUser(id);
    }

    public List<String> getAllUsersToString() {
        return user.getAllUsersToString();
    }

    public String getUserByIdToString(int id) {
        return user.getUserByIdToString(id);
    }
}
