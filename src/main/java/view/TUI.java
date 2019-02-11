package view;

public class TUI {

    private IInitialsGenerator initialsGenerator;
    private IPasswordGenerator passwordGenerator;

    public TUI(IInitialsGenerator initialsGenerator, IPasswordGenerator passwordGenerator) {
        this.initialsGenerator = initialsGenerator;
        this.passwordGenerator = passwordGenerator;
    }


    public void test(){

    }

}
