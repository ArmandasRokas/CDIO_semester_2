package businesslogic;

import data.dal.IUserDAO;
import data.dto.UserDTO;

import java.util.List;

public class UserController implements IUserController {
    // lignende metoder som DAO, men ogs[ noget ud over det.

    private IUserDAO userDAO;

    public UserController(IUserDAO userDAO){
        this.userDAO = userDAO;
    }

    public void createUser(int userId, String name, String cpr, List<String> roles) throws IUserDAO.DALException {
        UserDTO user = new UserDTO(userId, name, generateIni(name), cpr, "generated-pass", roles);

        try {
            userDAO.createUser(user);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }

    }


    public List<UserDTO> getUserList(){
        try {
            return userDAO.getUserList();
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
        return null;
    }

    public UserDTO getUser(int userId){

        try {
            return userDAO.getUser(userId);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateUser(int userId, String name, String cpr, List<String> roles){
        UserDTO user = new UserDTO(userId, name, "ganerated-ini", cpr, "generated-pass", roles);
        try {
            user.setIni(generateIni(user.getUserName()));
            userDAO.updateUser(user);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }

    }

    public void deleteUser(int userId){
        try {
            userDAO.deleteUser(userId);
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }

    }

    public boolean doesUserIdExist(int userId){
        try {
            for(UserDTO user: userDAO.getUserList()){
                if(user.getUserId() == userId){
                    System.out.println("User id already exists");
                    return true;
                }
            }
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
        return false;
    }


    public String generatePass(){
        //TODO implement method
        return null;
    }

    public String generateIni(String name){
        name.toUpperCase();
        String[] splitNamesArr = name.split(" ");
        String ini = "";

        if(splitNamesArr.length >= 2 && splitNamesArr.length <= 4){
            for(String s : splitNamesArr){
                ini += s.charAt(0);
            }
        } else if (splitNamesArr.length < 2){
            ini += splitNamesArr[0].charAt(0);
            ini += splitNamesArr[0].charAt(1);
        } else if (splitNamesArr.length > 4){
            for (int i = 0; i < 4; i++) {
                ini += splitNamesArr[i].charAt(0);
            }
        } else {
            return null; // no name entered
        }
        return ini;
    }
}
