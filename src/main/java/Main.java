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
        f.createUser(12, "Armandas", "AMD", "123456-7890", "test1234", "Administrator, Operator");

        // PRINT ALL USERS
        p.printAllUsers();
    }
}
