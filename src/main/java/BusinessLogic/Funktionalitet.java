package BusinessLogic;

import DataAccess.IUserDAO;
import DataAccess.UserDTO;

import java.util.List;

public class Funktionalitet {
    private IUserDAO user;

    public Funktionalitet(IUserDAO u) {
        user = u;
    }

    public List<String> getNames(){
        return user.getNames();
    }
}
