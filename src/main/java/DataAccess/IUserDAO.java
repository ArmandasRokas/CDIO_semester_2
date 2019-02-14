package DataAccess; // Data access layer

import java.util.List;

public interface IUserDAO {
    public int randomInt(int min, int max);
    public String getUserByIdToString(int id);
    public List<String> getAllUsersToString();
    public void createUser(String name, int birthYear);
    public void deleteUser(int id);
    public void updateUser(int id, String name, int birthYear);
}
