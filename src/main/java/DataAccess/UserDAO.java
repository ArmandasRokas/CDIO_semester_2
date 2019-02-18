package DataAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserDAO implements IUserDAO {
    private class User {
        int userID;
        String userName;
        String ini;
        String cpr;
        String password;
        String roles;

        User(int userID, String userName, String ini, String cpr, String password, String roles) {
            this.userID = userID;
            this.userName = userName;
            this.ini = ini;
            this.cpr = cpr;
            this.password = password;
            this.roles = roles;
        }

        @Override
        public String toString() {
            return "userID: " + userID + "\n" +
                    "userName: " + userName + "\n" +
                    "ini: " + ini + "\n" +
                    "cpr: " + cpr + "\n" +
                    "password: " + password + "\n" +
                    "roles: " + roles + "\n";
        }
    }

    private List<User> userNamesList;

    public UserDAO() {
        userNamesList = new ArrayList<User>();
        User u = new User(11, "Casper", "CH","123456-7890", "test1234", "Administrator, Operator");
        userNamesList.add(u);
    }

    public int randomInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public void createUser(int userID, String userName, String ini, String cpr, String password, String roles) {
        userNamesList.add(new User(userID, userName, ini, cpr, password, roles));
    }

    public void deleteUser(int id) {
        User u = getUserById(id);
        userNamesList.remove(u);
    }

    public void updateUser(int userID, String userName, String ini, String cpr, String password, String roles){
        User u = getUserById(userID);
        u.userID = userID;
        u.userName = userName;
        u.ini = ini;
        u.cpr = cpr;
        u.password = password;
        u.roles = roles;
    }

    public List<String> getAllUsersToString() {
        List<String> userStrings = new ArrayList<>();
        for (User u : userNamesList)
            userStrings.add(u.toString());
        return userStrings;
    }

    // for each User u in userNamesList, check if u.id equals id and return that User if it does
    public String getUserByIdToString(int id){
        for(User u : userNamesList)
            if(u.userID == id)
                return u.toString();
        return null;
    }

    public User getUserById(int id){
        for(User u : userNamesList)
            if(u.userID == id)
                return u;
        return null;
    }
}
