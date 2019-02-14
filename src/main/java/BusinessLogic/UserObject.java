package BusinessLogic;

import DataAccess.IUserDAO;
import DataAccess.UserDTO;

import java.util.List;

public class UserObject {
    private IUserDAO user;

    public UserObject(IUserDAO u) {
        user = u;
    }

    public void createUser(String name, int birthYear){
        user.createUser(name, birthYear);
    }

    public void updateUser(int id, String name, int birthYear){
        user.updateUser(id, name, birthYear);
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
