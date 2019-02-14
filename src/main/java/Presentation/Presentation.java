package Presentation;

import BusinessLogic.UserObject;

public class Presentation {
    private UserObject f;

    public Presentation(UserObject f) {
        this.f = f;
    }

    public void printAllUsers(){
        for (String s : f.getAllUsersToString()) {
            System.out.println(s);
        }
    }
}
