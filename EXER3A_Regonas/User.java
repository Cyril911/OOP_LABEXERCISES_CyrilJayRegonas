/**
 * Base class for all library users
 * Contains common attributes shared by all users
 */
public class User {
    protected String userId;
    protected String name;
    protected String email;
    protected String phone;
    
    // Default constructor
    public User() {
        this.userId = "Unknown";
        this.name = "Unknown";
        this.email = "Unknown";
        this.phone = "Unknown";
    }
    
    // Parameterized constructor
    public User(String userId, String name, String email, String phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    // Getters and setters
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    // Common methods for all users
    public void login() {
        System.out.println(name + " has logged in to the library system.");
    }
    
    public void logout() {
        System.out.println(name + " has logged out of the library system.");
    }
    
    @Override
    public String toString() {
        return "User [userId=" + userId + ", name=" + name + 
               ", email=" + email + ", phone=" + phone + "]";
    }
}
