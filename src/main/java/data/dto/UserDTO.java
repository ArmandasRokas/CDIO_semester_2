package data.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 4545864587995944260L;
    private int	userId;
    private String userName;
    private String ini;
    private String cpr;
    private String password;
    private List<String> roles;

    public UserDTO() {
        this.roles = new ArrayList<String>();
    }


    public UserDTO(int userId, String userName, String ini, String cpr, String password, List<String> roles) {
        this.userId = userId;
        this.userName = userName;
        this.ini = ini;
        this.cpr = cpr;
        this.password = password;
        this.roles = roles;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getIni() {
        return ini;
    }
    public void setIni(String ini) {
        this.ini = ini;
    }

    public List<String> getRoles() {
        return roles;
    }
    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void addRole(String role){
        this.roles.add(role);
    }
    /**
     *
     * @param role
     * @return true if role existed, false if not
     */
    public boolean removeRole(String role){
        return this.roles.remove(role);
    }

    @Override
    public String toString() {
        return "UserDTO [userId=" + userId + ", userName=" + userName + ", ini=" + ini + ", roles=" + roles + "]";
    }


    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr){
        this.cpr = cpr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass){
        password = pass;
    }
}