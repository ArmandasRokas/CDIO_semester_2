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
        String role;
        List<String> roles = new ArrayList<String>();

        do {
            System.out.println("Write id:");
            userID = scanner.nextInt();
            if (userID < 11 || userID > 99){
                System.out.println("Wrong id format");
            }
        }while (!userController.isUserIdAvailable(userID));

        do {
            System.out.println("Write name");
            userName = scanner.nextLine();
        }while (userName.length() < 2 || userName.length() > 20);

        do {
            System.out.println("Write cpr");
            cpr = scanner.nextLine();
        }while (cpr.length() != 10);

        while (scanner.hasNext()){
            role = scanner.nextLine();
            roles.add(role);
        }

        try {
            userController.createUser(userID, userName, cpr, roles);
        } catch (IUserDAO.DALException e) {
            System.err.println(e.getMessage());
            createUser();
        }
    }

    public void listUsers() {
        for(UserDTO user: userController.getUserList()){
            System.out.println(user.toString());
        }
    }

    public void updateUser() {
        int userID;
        String userName;
        String cpr;
        String role;
        List<String> roles = new ArrayList<String>();

        do {
            System.out.println("Enter ID of user to be updated: ");
            userID = scanner.nextInt();
            if (userID < 11 || userID > 99){
                System.out.println("Wrong id format");
            }
        }while (userController.isUserIdAvailable(userID));
        do {
            System.out.println("Write name");
            userName = scanner.nextLine();
        }while (userName.length() < 2 || userName.length() > 20);

        do {
            System.out.println("Write cpr");
            cpr = scanner.nextLine();
        }while (cpr.length() != 10);

        do {
            System.out.println("Add role? y/n");
            String yesNo = scanner.nextLine();
            if(yesNo.toLowerCase().equals("n")){
                break;
            }
            yesNo = "";
            System.out.println("Write the role");
            role = scanner.nextLine();
            roles.add(role);
        }while (true);

        userController.updateUser(userID, userName, cpr, roles);
    }

    public void deleteUser() {
        int userID;

        do {
            System.out.println("Enter ID of user to be deleted: ");
            userID = scanner.nextInt();
            if (userID < 11 || userID > 99){
                System.out.println("Wrong id format");
            }
        }while (!userController.isUserIdAvailable(userID));

        userController.deleteUser(userID);
    }

    public void exitProgram() {
        System.exit(0);
    }
}
