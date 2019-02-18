import businesslogic.IUserController;
import businesslogic.UserController;
import view.IUI;
import view.TUI;
import data.dal.UserDAO_arraylist;
import data.dal.IUserDAO;

public class Main {

    public static void main(String[] args) {


        IUserDAO userDAO = new UserDAO_arraylist();
        IUserController userController = new UserController(userDAO);
        IUI ui = new TUI(userController);

        ui.showMenu();

    }
}
