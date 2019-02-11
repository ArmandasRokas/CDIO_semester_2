import view.IUI;
import view.TUI;
import data.dao.ArrayListUserDAO;
import data.dao.IUserDAO;

public class Main {

    public static void main(String[] args) {

        IUserDAO userDAO = new ArrayListUserDAO();
        IInitialsGenerator initialsGenerator = new InitialsGenerator();


        IUI ui = new TUI(IInitialsGenerator );

    }
}
