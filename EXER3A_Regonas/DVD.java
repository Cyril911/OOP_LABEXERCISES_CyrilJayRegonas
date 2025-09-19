/**
 * Subclass of LibraryItem for DVDs
 */
public class DVD extends LibraryItem {
    protected int duration; // in minutes
    protected String genre;
    protected String rating;
    
    // Default constructor
    public DVD() {
        super();
        this.duration = 0;
        this.genre = "Unknown";
        this.rating = "Unknown";
    }
    
    // Parameterized constructor
    public DVD(String itemId, String title, String author, int publicationYear, 
              int duration, String genre, String rating) {
        super(itemId, title, author, publicationYear);
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
    }
    
    // Getters and setters
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public String getRating() { return rating; }
    public void setRating(String rating) { this.rating = rating; }
    
    // DVD specific methods
    public void play() {
        System.out.println("Playing DVD: " + title + " (" + duration + " minutes)");
    }
    
    public void pause() {
        System.out.println("Pausing DVD: " + title);
    }
    
    @Override
    public String toString() {
        return "DVD [duration=" + duration + ", genre=" + genre + 
               ", rating=" + rating + ", " + super.toString() + "]";
    }
}
