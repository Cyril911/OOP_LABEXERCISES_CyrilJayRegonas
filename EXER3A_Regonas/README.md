# Object-Oriented Programming Exercise 3

This project contains two main exercises demonstrating inheritance concepts in Java.

## Exercise 3A - Transportation System

### Class Hierarchy
The transportation system includes:
- **Transportation** (Base class)
  - **AirTransport** (Airplane, Helicopter, Drone)
  - **LandTransport** (Truck, SUV, Tricycle, Motorcycle, Kariton)
  - **WaterTransport** (Yacht, Submarine)

### Files
- `Transportation.java` - Base class for all transportation
- `AirTransport.java` - Air transportation base class
- `LandTransport.java` - Land transportation base class
- `WaterTransport.java` - Water transportation base class
- `Airplane.java`, `Helicopter.java`, `Drone.java` - Air transport subclasses
- `Truck.java`, `SUV.java`, `Tricycle.java`, `Motorcycle.java`, `Kariton.java` - Land transport subclasses
- `Yacht.java`, `Submarine.java` - Water transport subclasses
- `TransportationTester.java` - Test class with instances of all subclasses

### How to Run
```bash
javac *.java
java TransportationTester
```

## Exercise 3B - Library Management System

### Class Hierarchy
The library management system includes:
- **LibraryItem** (Base class)
  - **Book** (Fiction, NonFiction, Reference)
  - **Magazine**
  - **DVD**
- **User** (Base class)
  - **Member** (Student, Faculty, Guest)
  - **Librarian**
  - **Admin**

### Files
- `LibraryItem.java` - Base class for all library items
- `Book.java`, `Magazine.java`, `DVD.java` - Library item subclasses
- `Fiction.java`, `NonFiction.java`, `Reference.java` - Book subclasses
- `User.java` - Base class for all users
- `Member.java` - Member base class
- `Student.java`, `Faculty.java`, `Guest.java` - Member subclasses
- `Librarian.java`, `Admin.java` - User subclasses
- `ProjectTester.java` - Test class with instances of all classes

### How to Run
```bash
javac *.java
java ProjectTester
```

## Features Demonstrated

### Inheritance
- Base classes with common attributes and methods
- Subclasses extending base classes with specific attributes
- Method overriding in subclasses
- Polymorphism through inheritance

### Encapsulation
- Private attributes with public getters and setters
- Protected attributes for inheritance
- Data hiding and access control

### Polymorphism
- Method overriding in subclasses
- Dynamic method dispatch
- Same method names with different implementations

## Class Diagrams
- `TransportationHierarchy.md` - Transportation system class hierarchy
- `LibrarySystemHierarchy.md` - Library management system class hierarchy

## Requirements Met

### Exercise 3A
✅ Created class hierarchy diagram for Transportation system
✅ Implemented all required classes with inheritance
✅ Created TransportationTester with instances of all subclasses
✅ Included all specified subclasses (Truck, SUV, Tricycle, Motorcycle, Kariton)
✅ Added additional subclasses for Air and Water transport

### Exercise 3B
✅ Created class hierarchy diagram for Library Management System
✅ Implemented comprehensive class structure with inheritance
✅ Created ProjectTester with instances of all classes
✅ Demonstrated real-world system design with multiple inheritance levels
