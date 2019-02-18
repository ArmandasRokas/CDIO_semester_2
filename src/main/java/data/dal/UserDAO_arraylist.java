package data.dal;

import data.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserDAO_arraylist implements IUserDAO {

    private List<UserDTO> users; // maybe public static?

    public UserDAO_arraylist(){
        users = new ArrayList<UserDTO>();
        users.add(new UserDTO(12,"John","j.p", "123456780", "13245,", null));
    }


    public UserDTO getUser(int userId) throws DALException {

        for(UserDTO userDTO: users){
            if(userDTO.getUserId() == userId){
                return userDTO;
            }

        }

        return null; //TODO ask where to handle null. Controller? DAL? TUI?
                //TODO throws execption here for nor=t userID found.

    }

    public List<UserDTO> getUserList() throws DALException {
        return users;
    }



    public void createUser(UserDTO user) throws DALException {


        for(UserDTO userDTO: users){
            if(userDTO.getUserId() == user.getUserId()){
                throw new DALException("User id already exists. ");
            }
        }
        users.add(user);
    }

    public void updateUser(UserDTO user) throws DALException {

        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUserId() == user.getUserId()){
                users.set(i, user);
            }
        }
    }

    public void deleteUser(int userId) throws DALException {

        for(int i = 0; i<users.size(); i++){
            if(users.get(i).getUserId() == userId){
                users.remove(i);
            }
        }
    }
}
