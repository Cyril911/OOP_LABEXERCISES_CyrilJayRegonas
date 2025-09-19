/**
 * Subclass of Member for faculty members
 */
public class Faculty extends Member {
    private String employeeId;
    private String department;
    private String position;
    
    // Default constructor
    public Faculty() {
        super();
        this.employeeId = "Unknown";
        this.department = "Unknown";
        this.position = "Unknown";
    }
    
    // Parameterized constructor
    public Faculty(String userId, String name, String email, String phone, String membershipType,
                  String employeeId, String department, String position) {
        super(userId, name, email, phone, membershipType);
        this.employeeId = employeeId;
        this.department = department;
        this.position = position;
    }
    
    // Getters and setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    
    // Faculty specific methods
    public void teach() {
        System.out.println(name + " is teaching in " + department + " as " + position);
    }
    
    public void research() {
        System.out.println(name + " is conducting research in " + department);
    }
    
    @Override
    public String toString() {
        return "Faculty [employeeId=" + employeeId + ", department=" + department + 
               ", position=" + position + ", " + super.toString() + "]";
    }
}
