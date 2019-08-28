package xyz.joedai.schoolproj;

/**
 * Student class - defines a student in a School
 * <br>
 * Holds basic information about student (first name, last name, grade he/she is in).
 * <br>
 * In addition, a unique student ID will be assigned to the student upon construction of a Student object
 * <br>
 * toString() method prints out the above information in a human-readable way
 */
public class Student {
    // --- Initialize variables --- //
    private String firstName;
    private String lastName;
    private int grade;
    private final int studentID;    // studentID should be immutable

    private static int lastStudentID = 0;   // to implement unique (consecutive) student IDs


    // --- Constructors --- //
    /**
     * Default constructor for Student class - sets all fields to
     * "Undefined"/0 and just assign a unique student ID
     */
    Student() {
        // Set all to "undefined"/0, but assign unique student ID
        this.firstName = "Undefined";
        this.lastName = "Undefined";
        this.grade = 0;

        // Unique student IDs - increment lastStudentID and set it as this student's student ID
        lastStudentID++;
        this.studentID = lastStudentID;
    }

    /**
     * Parameterized constructor for Student class
     *
     * @param firstName First name of student
     * @param lastName Last name of student
     * @param grade Grade that the student is currently in
     */
    Student(String firstName, String lastName, int grade) {
        // Standard constructor assignments
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;

        // Unique student IDs - increment lastStudentID and set it as this student's student ID
        lastStudentID++;
        this.studentID = lastStudentID;
    }


    // --- Methods --- //
    /**
     * Returns a string with information about the student
     *
     * @return string with the name of the student and grade he/she is in
     */
    @Override
    public String toString() {
        // Returns "Name: {name} Grade: {grade}"
        return String.format("Name: %s %s Grade: %d", this.firstName, this.lastName, this.grade);
    }

    /**
     * Overrides equals() with fixed version of equals() that compares if the 2 objects' info are the same
     * (rather than the default, which compares if they are the same object)
     * <br>
     * <i>Required for the removeStudent() method of the School class</i>
     *
     * @param obj Object to compare to this object
     * @return If given object is equal to this object
     */
    @Override
    public boolean equals(Object obj) {
        // Cast type to correct type
        Student studentObj = (Student) obj;

        // Check if first name, last name, and grade are the same and return result
        return studentObj.firstName == this.firstName &&
               studentObj.lastName == this.lastName &&
               studentObj.grade == this.grade;
    }


    // --- Getters & Setters --- //
    // First name
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Last name
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Grade
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Student ID (should be immutable, so no setter is defined)
    public int getStudentID() {
        return studentID;
    }
}
