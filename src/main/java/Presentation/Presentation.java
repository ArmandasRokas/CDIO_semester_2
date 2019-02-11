package Presentation;

import BusinessLogic.Funktionalitet;

public class Presentation {
    private Funktionalitet f;

    public Presentation(Funktionalitet f) {
        this.f = f;
    }

    public void printAllUsers(){
        for (String s : f.getNames()) {
            System.out.println(s);
        }
    }
}
