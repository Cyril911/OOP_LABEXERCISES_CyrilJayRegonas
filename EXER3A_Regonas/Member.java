/**
 * Subclass of User for library members
 */
public class Member extends User {
    protected String membershipType;
    
    // Default constructor
    public Member() {
        super();
        this.membershipType = "Unknown";
    }
    
    // Parameterized constructor
    public Member(String userId, String name, String email, String phone, String membershipType) {
        super(userId, name, email, phone);
        this.membershipType = membershipType;
    }
    
    // Getters and setters
    public String getMembershipType() { return membershipType; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }
    
    // Member specific methods
    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            item.borrow();
            System.out.println(name + " borrowed " + item.getTitle());
        } else {
            System.out.println("Cannot borrow " + item.getTitle() + " - not available");
        }
    }
    
    public void returnItem(LibraryItem item) {
        item.returnItem();
        System.out.println(name + " returned " + item.getTitle());
    }
    
    @Override
    public String toString() {
        return "Member [membershipType=" + membershipType + ", " + super.toString() + "]";
    }
}
