import BusinessLogic.UserObject;
import DataAccess.IUserDAO;
import DataAccess.UserDTO;
import Presentation.Presentation;

public class Main {
    public static void main(String[] args) {
        IUserDAO u = new UserDTO();
        UserObject f = new UserObject(u); // TODO: Add interface for functionality
        Presentation p = new Presentation(f); // TODO: Add interface for presentation

        // BEFORE PRINT
        f.createUser("Armandas", 1990);


        // PRINT ALL USERS
        p.printAllUsers();
    }
}
