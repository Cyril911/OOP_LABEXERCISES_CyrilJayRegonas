/**
 * ProjectTester class to demonstrate the Library Management System
 * Creates instances of each class and demonstrates their functionality
 */
public class ProjectTester {
    public static void main(String[] args) {
        System.out.println("=== LIBRARY MANAGEMENT SYSTEM TESTER ===\n");
        
        // Create instances of each class
        System.out.println("1. LIBRARY ITEMS:");
        System.out.println("=================");
        
        // Fiction Book instance
        Fiction fiction = new Fiction("BK001", "The Great Gatsby", "F. Scott Fitzgerald", 1925, 
                                    "9780743273565", 180, "Classic Literature", "None", "5/5");
        System.out.println("Fiction Book: " + fiction);
        fiction.borrow();
        fiction.read();
        fiction.imagine();
        fiction.bookmark(50);
        fiction.recommend();
        fiction.returnItem();
        System.out.println();
        
        // Non-Fiction Book instance
        NonFiction nonFiction = new NonFiction("BK002", "Introduction to Java Programming", 
                                             "Daniel Liang", 2020, "9780136520238", 1200, 
                                             "Programming", "Computer Science", "Beginner");
        System.out.println("Non-Fiction Book: " + nonFiction);
        nonFiction.borrow();
        nonFiction.study();
        nonFiction.research();
        nonFiction.returnItem();
        System.out.println();
        
        // Reference Book instance
        Reference reference = new Reference("BK003", "Oxford English Dictionary", 
                                          "Oxford University Press", 2019, "9780199571123", 
                                          2000, "Reference", "12th Edition", "2023");
        System.out.println("Reference Book: " + reference);
        reference.borrow();
        reference.lookup();
        reference.cite();
        reference.returnItem();
        System.out.println();
        
        // Magazine instance
        Magazine magazine = new Magazine("MG001", "National Geographic", "Various", 2023, 
                                       "December 2023", "Vol. 245", "National Geographic Society");
        System.out.println("Magazine: " + magazine);
        magazine.borrow();
        magazine.browse();
        magazine.subscribe();
        magazine.returnItem();
        System.out.println();
        
        // DVD instance
        DVD dvd = new DVD("DV001", "The Matrix", "The Wachowskis", 1999, 136, "Sci-Fi", "R");
        System.out.println("DVD: " + dvd);
        dvd.borrow();
        dvd.play();
        dvd.pause();
        dvd.returnItem();
        System.out.println();
        
        System.out.println("2. LIBRARY USERS:");
        System.out.println("=================");
        
        // Student instance
        Student student = new Student("USR001", "Juan Dela Cruz", "juan@student.edu.ph", 
                                    "09123456789", "Student", "2023-12345", "BSIT", 3);
        System.out.println("Student: " + student);
        student.login();
        student.study();
        student.borrowItem(fiction);
        student.requestExtension();
        student.returnItem(fiction);
        student.logout();
        System.out.println();
        
        // Faculty instance
        Faculty faculty = new Faculty("USR002", "Dr. Maria Santos", "maria@faculty.edu.ph", 
                                    "09123456790", "Faculty", "EMP001", "Computer Science", 
                                    "Professor");
        System.out.println("Faculty: " + faculty);
        faculty.login();
        faculty.teach();
        faculty.research();
        faculty.borrowItem(nonFiction);
        faculty.returnItem(nonFiction);
        faculty.logout();
        System.out.println();
        
        // Guest instance
        Guest guest = new Guest("USR003", "John Smith", "john@email.com", "09123456791", 
                               "Guest", "GST001", "Research", 7);
        System.out.println("Guest: " + guest);
        guest.login();
        guest.visit();
        guest.requestAccess();
        guest.borrowItem(magazine);
        guest.returnItem(magazine);
        guest.logout();
        System.out.println();
        
        // Librarian instance
        Librarian librarian = new Librarian("USR004", "Ana Garcia", "ana@library.edu.ph", 
                                          "09123456792", "LIB001", "Circulation", "Morning");
        System.out.println("Librarian: " + librarian);
        librarian.login();
        librarian.catalogItem(fiction);
        librarian.helpMember(student);
        librarian.logout();
        System.out.println();
        
        // Admin instance
        Admin admin = new Admin("USR005", "Robert Johnson", "robert@admin.edu.ph", 
                               "09123456793", "ADM001", "IT Department", "Full Access");
        System.out.println("Admin: " + admin);
        admin.login();
        admin.manageSystem();
        admin.generateReport();
        admin.logout();
        System.out.println();
        
        System.out.println("3. SYSTEM INTERACTIONS:");
        System.out.println("=======================");
        
        // Demonstrate system interactions
        System.out.println("Demonstrating system interactions:");
        student.login();
        librarian.login();
        admin.login();
        
        // Student borrows a book
        student.borrowItem(fiction);
        
        // Librarian helps student
        librarian.helpMember(student);
        
        // Admin manages system
        admin.manageSystem();
        
        // Student returns book
        student.returnItem(fiction);
        
        // Librarian catalogs new item
        librarian.catalogItem(dvd);
        
        // Admin generates report
        admin.generateReport();
        
        // All users logout
        student.logout();
        librarian.logout();
        admin.logout();
        
        System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM TESTING COMPLETED ===");
    }
}
