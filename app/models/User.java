package models;
import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a user.
 */
@Entity
public class User extends Model {

    @Id
    private String username;
    
    private String pwd;
    private String email;
    private String name;
    private String phone;
    private String address;
    private boolean locked;
    private String roles;
    
    @ManyToMany
    private List<Item> cart = new ArrayList<Item>();
    
    /**
     * Finder.
     */
    private static Finder<String, User> find
        = new Finder<String, User>(User.class);
    
    /**
     * Find a user by username (ID).
     * @param id the user's username (ID)
     * @return the user found
     */
    public static User findById(String id) {
        return find.byId(id);
    }
    
    /**
     * Find all users.
     * @return the user list found
     */
    public static List<User> findAll() {
        return find.all();
    }
    
    /**
     * Getters for private fields.
     */

    public String getUsername() {
        return username;
    }
    
    public String getPwd() {
        return pwd;
    }
 
    public String getEmail() {
        return email;
    }
  
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
  
    public String getAddress() {
        return address;
    }
   
    public boolean getLocked() {
        return locked;
    }
  
    public String getRoles() {
        return roles;
    }
    
    public List<Item> getCart() {
        return cart;
    }
    
    /**
     * Setters for private fields.
     */
   
    public void setUsername(String usernameNew) {
        this.username = usernameNew;
    }
   
    public void setPwd(String pwdNew) {
        this.pwd = pwdNew;
    }
  
    public void setEmail(String emailNew) {
        this.email = emailNew;
    }
    
    public void setName(String nameNew) {
        this.name = nameNew;
    }
   
    public void setPhone(String phoneNew) {
        this.phone = phoneNew;
    }
   
    public void setAddress(String addressNew) {
        this.address = addressNew;
    }
   
    public void setLocked(boolean lockedNew) {
        this.locked = lockedNew;
    }
    
    public void setRoles(String roles) {
        this.roles = roles;
    }
    
    public void setCart(List<Item> cartNew) {
        this.cart = cartNew;
    }
}
