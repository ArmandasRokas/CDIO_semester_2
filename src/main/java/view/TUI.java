package view;

import businesslogic.IUserController;

import java.util.Scanner;

public class TUI implements IUI {


    private IUserController userController;
    private Scanner scanner;

    public TUI(IUserController userController) {
        this.userController = userController;

        // Skal nok skrives om så TUI kun tager en scanner som parameter
        // og ikke initiere den selv (for at undgå at TUI er en creator).
        scanner = new Scanner(System.in);
    }


    public void test(){

    }

    public void showMenu() {
        switch (scanner.nextInt()) {
            case 1: createUser();
                break;
            case 2: listUsers();
                break;
            case 3: updateUser();
                break;
            case 4: deleteUser();
                break;
            case 5: exitProgram();
                break;
        }
    }

    // Følgende metoder vil - når de er implementeret - kalde metoder
    // i det underliggende lag.

    public void createUser() {

    }

    public void listUsers() {

    }

    public void updateUser() {

    }

    public void deleteUser() {

    }

    public void exitProgram() {

    }
}
