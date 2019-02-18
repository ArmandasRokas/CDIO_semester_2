package DataAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserDAO implements IUserDAO {
    private class User {
        int id;
        String name;
        int birthYear;

        User(int id, String name, int birtyYear) {
            this.id = id;
            this.name = name;
            this.birthYear = birtyYear;
        }

        @Override
        public String toString() {
            return "id: " + id + "\n" +
                    "name: " + name + "\n" +
                    "birthYear: " + birthYear + "\n";
        }
    }

    private List<User> userNamesList;

    public UserDAO() {
        userNamesList = new ArrayList<User>();
        User u = new User(1, "Casper", randomInt(1950, 2005));
        userNamesList.add(u);
    }

    public int randomInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public void createUser(int id, String name, int birthYear) {
        userNamesList.add(new User(id, name, birthYear));
    }

    public void deleteUser(int id) {
        User u = getUserById(id);
        userNamesList.remove(u);
    }

    public void updateUser(int id, String name, int birthYear){
        User u = getUserById(id);
        u.name = name;
        u.birthYear = birthYear;
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
            if(u.id == id)
                return u.toString();
        return null;
    }

    public User getUserById(int id){
        for(User u : userNamesList)
            if(u.id == id)
                return u;
        return null;
    }
}
