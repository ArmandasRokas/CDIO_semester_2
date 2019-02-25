package view;

import businesslogic.IUserController;
import businesslogic.UserController;
import data.dal.IUserDAO;
import data.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;
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
        List<String> roles = new ArrayList<String>();
        roles.add("user"); //TODO implement scanner

        do {
            System.out.println("Write id:");
            userID = scanner.nextInt();
            if (userID < 11 || userID > 99 ){
                System.out.println("Wrong id format");
            }
        }while (userID < 11 || userID > 99);
//|| !userController.isUserIdAvailable(userID)
        do {
            System.out.println("Write name");
            userName = scanner.nextLine();
        }while (userName.length() < 2 || userName.length() > 20);

        do {
            System.out.println("Write cpr");
            cpr = scanner.nextLine();
        }while (cpr.length() != 10);

        try {
            userController.createUser(userID, userName, cpr, roles);
        } catch (IUserDAO.DALException e) {
            System.err.println(e.getMessage());
            createUser();
        }

    }

    public void listUsers() {

        /*(UserDTO user: userController.getUserList()){
            System.out.println(user.toString());
        }*/
        System.out.println(userController.getUser(11));

    }

    public void updateUser() {

    }

    public void deleteUser() {

    }

    public void exitProgram() {
        System.exit(0);
    }
}
