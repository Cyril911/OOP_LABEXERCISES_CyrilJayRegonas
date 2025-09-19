/**
 * Subclass of Member for students
 */
public class Student extends Member {
    private String studentId;
    private String course;
    private int yearLevel;
    
    // Default constructor
    public Student() {
        super();
        this.studentId = "Unknown";
        this.course = "Unknown";
        this.yearLevel = 0;
    }
    
    // Parameterized constructor
    public Student(String userId, String name, String email, String phone, String membershipType,
                  String studentId, String course, int yearLevel) {
        super(userId, name, email, phone, membershipType);
        this.studentId = studentId;
        this.course = course;
        this.yearLevel = yearLevel;
    }
    
    // Getters and setters
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    
    public int getYearLevel() { return yearLevel; }
    public void setYearLevel(int yearLevel) { this.yearLevel = yearLevel; }
    
    // Student specific methods
    public void study() {
        System.out.println(name + " is studying " + course + " (Year " + yearLevel + ")");
    }
    
    public void requestExtension() {
        System.out.println(name + " requested extension for borrowed items");
    }
    
    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", course=" + course + 
               ", yearLevel=" + yearLevel + ", " + super.toString() + "]";
    }
}
