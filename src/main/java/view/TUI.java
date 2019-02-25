package view;

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

    private int userID = 0;
    private String userName = "";
    private String cpr = "";
    private String role = "";
    private List<String> roles = new ArrayList<String>();

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

    public void runConsole(boolean runIt){
        do {
            System.out.println("Enter ID of user: ");
            userID = scanner.nextInt();
            if (userID < 11 || userID > 99){
                System.out.println("Wrong id format");
            }
        }while (userController.doesUserIdExist(userID) && runIt);
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
    }

    public void createUser() {
        runConsole(true);

        try {
            userController.createUser(userID, userName, cpr, roles);
        } catch (IUserDAO.DALException e) {
            System.err.println(e.getMessage());
            createUser();
        }
    }

    public void updateUser() {
        runConsole(false);

        userController.updateUser(userID, userName, cpr, roles);
    }

    public void listUsers() {
        for(UserDTO user: userController.getUserList()){
            System.out.println(user.toString());
        }
    }

    public void deleteUser() {
        int userID;

        do {
            System.out.println("Enter ID of user to be deleted: ");
            userID = scanner.nextInt();
            if (userID < 11 || userID > 99){
                System.out.println("Wrong id format");
            }
            System.out.println(userController.doesUserIdExist(userID));
        }while (!userController.doesUserIdExist(userID));

        userController.deleteUser(userID);
    }

    public void exitProgram() {
        System.exit(0);
    }
}
