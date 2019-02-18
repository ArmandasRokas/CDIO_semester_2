package view;

import businesslogic.IUserController;
import businesslogic.UserController;

import java.util.Scanner;

public class TUI implements IUI {

    private UserController userController;
    private Scanner scanner;

    public TUI(UserController userController) {
        this.userController = userController;
        scanner = new Scanner(System.in);
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

    public void createUser() {
        int userID;
        String userName;
        String cpr;

        do {
            userID = scanner.nextInt();
        }while ((userID < 11 || userID > 99) && !userController.isUserIdAvailable(userID));

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
