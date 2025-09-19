/**
 * Subclass of User for administrators
 */
public class Admin extends User {
    private String adminId;
    private String department;
    private String accessLevel;
    
    // Default constructor
    public Admin() {
        super();
        this.adminId = "Unknown";
        this.department = "Unknown";
        this.accessLevel = "Unknown";
    }
    
    // Parameterized constructor
    public Admin(String userId, String name, String email, String phone,
                String adminId, String department, String accessLevel) {
        super(userId, name, email, phone);
        this.adminId = adminId;
        this.department = department;
        this.accessLevel = accessLevel;
    }
    
    // Getters and setters
    public String getAdminId() { return adminId; }
    public void setAdminId(String adminId) { this.adminId = adminId; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public String getAccessLevel() { return accessLevel; }
    public void setAccessLevel(String accessLevel) { this.accessLevel = accessLevel; }
    
    // Admin specific methods
    public void manageSystem() {
        System.out.println(name + " is managing the library system (Access Level: " + accessLevel + ")");
    }
    
    public void generateReport() {
        System.out.println(name + " generated a library report");
    }
    
    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", department=" + department + 
               ", accessLevel=" + accessLevel + ", " + super.toString() + "]";
    }
}
