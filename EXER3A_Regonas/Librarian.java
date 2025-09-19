/**
 * Subclass of User for librarians
 */
public class Librarian extends User {
    private String employeeId;
    private String department;
    private String shift;
    
    // Default constructor
    public Librarian() {
        super();
        this.employeeId = "Unknown";
        this.department = "Unknown";
        this.shift = "Unknown";
    }
    
    // Parameterized constructor
    public Librarian(String userId, String name, String email, String phone,
                    String employeeId, String department, String shift) {
        super(userId, name, email, phone);
        this.employeeId = employeeId;
        this.department = department;
        this.shift = shift;
    }
    
    // Getters and setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }
    
    // Librarian specific methods
    public void catalogItem(LibraryItem item) {
        System.out.println(name + " cataloged item: " + item.getTitle());
    }
    
    public void helpMember(Member member) {
        System.out.println(name + " is helping " + member.getName() + " with library services");
    }
    
    @Override
    public String toString() {
        return "Librarian [employeeId=" + employeeId + ", department=" + department + 
               ", shift=" + shift + ", " + super.toString() + "]";
    }
}
