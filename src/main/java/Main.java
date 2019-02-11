import BusinessLogic.Funktionalitet;
import DataAccess.IUserDAO;
import DataAccess.UserDTO;
import Presentation.Presentation;

public class Main {
    public static void main(String[] args) {
        IUserDAO u = new UserDTO();
        Funktionalitet f = new Funktionalitet(u); // TODO: Add interface for functionality
        Presentation p = new Presentation(f); // TODO: Add interface for presentation

        // PRINT ALL USERS
        p.printAllUsers();
    }
}
