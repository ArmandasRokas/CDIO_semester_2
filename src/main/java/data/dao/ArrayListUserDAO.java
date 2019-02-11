package data.dao;

import data.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUserDAO implements IUserDAO {

    public static List<UserDTO> users;

    public ArrayListUserDAO(){
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
