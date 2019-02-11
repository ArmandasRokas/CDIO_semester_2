package DataAccess; // Data access layer

import java.util.List;

public interface IUserDAO {

    List<String> getNames();
    UserDTO getUser(int userId);
    List<UserDTO> getUserList();
    void createUser(UserDTO user);
    void updateUser(UserDTO user);
    void deleteUser(int userId);
}
