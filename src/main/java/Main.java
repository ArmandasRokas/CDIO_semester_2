import businesslogic.IUserController;
import businesslogic.UserController;
import data.dal.UserDAO_sql;
import view.IUI;
import view.TUI;
import data.dal.UserDAO_arraylist;
import data.dal.IUserDAO;

public class Main {

    public static void main(String[] args) {


        //IUserDAO userDAO = new UserDAO_arraylist();
        IUserDAO u = new UserDAO_sql();
        UserController userController = new UserController(u);
        IUI ui = new TUI(userController);

        while(true){

            ui.showMenu();
        }

    }
}
