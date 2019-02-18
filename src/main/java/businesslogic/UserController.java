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

    public void createUser(int userId, String name, String cpr, List<String> roles){

        // validate ID, if it exists
            // sout("Invalid user id")
            // return false;


        //generere ini
       // PasswordGenerator.generatePass();
        // generare pass


        UserDTO user = new UserDTO(userId, name, "ganerated-ini", cpr, "generated-pass", roles);

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

    public boolean isUserIdAvailable(int userId){

        try {
            for(UserDTO user: userDAO.getUserList()){
                if(user.getUserId() == userId){
                    System.out.println("User id already exists");
                    return false;
                }
            }
        } catch (IUserDAO.DALException e) {
            e.printStackTrace();
        }
        return true;
    }


    public String generatePass(){
        //TODO implement method
        return null;
    }

    public String generateIni(String name){
        String[] splitNamesArr = name.split(" ");
        String ini = "";

        for( int i = 0 ; i < splitNamesArr.length ; i++) {
            ini += splitNamesArr[i].charAt(0);
        }

        if(splitNamesArr.length > 4){
            return splitNamesArr[0] + splitNamesArr[splitNamesArr.length - 1];
        } else if (splitNamesArr.length < 2){
            return ini.charAt(0) + ini.charAt(1) + "";
        } else {
            return ini;
        }

    }
}
