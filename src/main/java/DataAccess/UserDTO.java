package DataAccess;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserDTO implements Serializable, IUserDAO {

    UserDAO user = new UserDAO();
    private int _id;
    private String _name;
    private int _birthYear;

    public int getId() { return _id; }
    public void setId(int value) { _id = value; }

    public String getName() { return _name; }
    public void setName(String value) { _name = value; }

    public int getBirthYear() { return _birthYear; }
    public void setBirthYear(int value) { _birthYear = value; }

    public UserDTO(){

    }

    @Override
    public int randomInt(int min, int max) {
        return user.randomInt(min, max);
    }

    @Override
    public String getUserByIdToString(int id) {
        return user.getUserByIdToString(id);
    }

    @Override
    public List<String> getAllUsersToString() {
        return user.getAllUsersToString();
    }

    @Override
    public void createUser(int userID, String userName, String ini, String cpr, String password, String roles) {
        user.createUser(userID, userName, ini, cpr, password, roles);
    }

    @Override
    public void deleteUser(int id) {
        user.deleteUser(id);
    }

    @Override
    public void updateUser(int userID, String userName, String ini, String cpr, String password, String roles) {
        user.updateUser(userID, userName, ini, cpr, password, roles);
    }
}