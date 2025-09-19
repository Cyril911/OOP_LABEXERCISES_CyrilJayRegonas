/**
 * Subclass of Member for guest users
 */
public class Guest extends Member {
    private String guestId;
    private String visitPurpose;
    private int visitDuration; // in days
    
    // Default constructor
    public Guest() {
        super();
        this.guestId = "Unknown";
        this.visitPurpose = "Unknown";
        this.visitDuration = 0;
    }
    
    // Parameterized constructor
    public Guest(String userId, String name, String email, String phone, String membershipType,
                String guestId, String visitPurpose, int visitDuration) {
        super(userId, name, email, phone, membershipType);
        this.guestId = guestId;
        this.visitPurpose = visitPurpose;
        this.visitDuration = visitDuration;
    }
    
    // Getters and setters
    public String getGuestId() { return guestId; }
    public void setGuestId(String guestId) { this.guestId = guestId; }
    
    public String getVisitPurpose() { return visitPurpose; }
    public void setVisitPurpose(String visitPurpose) { this.visitPurpose = visitPurpose; }
    
    public int getVisitDuration() { return visitDuration; }
    public void setVisitDuration(int visitDuration) { this.visitDuration = visitDuration; }
    
    // Guest specific methods
    public void visit() {
        System.out.println(name + " is visiting for " + visitPurpose + " (" + visitDuration + " days)");
    }
    
    public void requestAccess() {
        System.out.println(name + " requested access to library resources");
    }
    
    @Override
    public String toString() {
        return "Guest [guestId=" + guestId + ", visitPurpose=" + visitPurpose + 
               ", visitDuration=" + visitDuration + ", " + super.toString() + "]";
    }
}
