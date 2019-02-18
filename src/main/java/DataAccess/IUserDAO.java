package DataAccess; // Data access layer

import java.util.List;

public interface IUserDAO {
    public int randomInt(int min, int max);
    public String getUserByIdToString(int id);
    public List<String> getAllUsersToString();
    public void createUser(int userID, String userName, String ini, String cpr, String password, String roles);
    public void deleteUser(int id);
    public void updateUser(int userID, String userName, String ini, String cpr, String password, String roles);

}
