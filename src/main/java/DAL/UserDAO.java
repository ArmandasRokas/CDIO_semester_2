package DAL;

import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {

    List<UserDTO> users;

    public UserDAO(){
        users = new ArrayList<UserDTO>();
        users.add(new UserDTO());
        users.add(new UserDTO());
        users.add(new UserDTO());
        users.add(new UserDTO());

    }


    public UserDTO getUser(int userId) throws DALException {




        return null;
    }

    public List<UserDTO> getUserList() throws DALException {
        return users;
    }

    public void createUser(UserDTO user) throws DALException {

    }

    public void updateUser(UserDTO user) throws DALException {

    }

    public void deleteUser(int userId) throws DALException {

    }
}
