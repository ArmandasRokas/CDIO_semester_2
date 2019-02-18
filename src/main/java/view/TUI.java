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
        System.out.println("1. Create User\n2. List Users\n3. Update User\n4. Delete User\n5. Exit Program");

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
        int userID;
        String userName;
        String cpr;

        do {
            userID = scanner.nextInt();
        }while (userID < 11 || userID > 99);

        do {
            userName = scanner.nextLine();
        }while (userName.length() < 2 || userName.length() > 20);

        do {
            cpr = scanner.nextLine();
        }while (cpr.length() != 10);
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
