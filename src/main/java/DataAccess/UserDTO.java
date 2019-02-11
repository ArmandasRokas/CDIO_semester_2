package DataAccess;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDTO implements Serializable, IUserDAO {

    private static final long serialVersionUID = 4545864587995944260L;
    private int	userId;
    private String userName;
    private String ini;
    private List<String> roles;
    //TODO Add relevant fields

//    private List<Ingredient> ingredients;
//
//    public DemoData() {
//        ingredients = new ArrayList<>();
//        ingredients.add(new Ingredient(1, "flormelis", 60));
//        ingredients.add(new Ingredient(2, "mel", 240));
//        ingredients.add(new Ingredient(3, "sm�r", 185));
//    }
    private List<String> userList;

    public UserDTO() {
        userList = new ArrayList<String>();
        userList.add("Casper");
        userList.add("Armandas");
        userList.add("Emil");
        userList.add("Tobias");
        userList.add("David");
    }

    public List<String> getNames(){
        return userList;
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

    public UserDTO getUser(int userId){
        return null;
    }

    public List<UserDTO> getUserList(){
        return null;
    }

    public void createUser(UserDTO user){

    }

    public void updateUser(UserDTO user){

    }

    public void deleteUser(int userId){

    }
}