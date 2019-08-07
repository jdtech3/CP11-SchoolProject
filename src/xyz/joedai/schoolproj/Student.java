package xyz.joedai.schoolproj;

public class Student {
    // --- Initialize variables --- //
    private String firstName;
    private String lastName;
    private int grade;
    private final int studentID;

    private static int lastStudentID = 0;   // to implement unique (consecutive) student IDs


    // --- Constructor --- //
    Student(String firstName, String lastName, int grade) {
        // Standard constructor assignments
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;

        // Unique student IDs - increment lastStudentID and set it as this student's student ID
        lastStudentID++;
        this.studentID = lastStudentID;
    }


    // --- Main methods --- //

    // - object as a string -
    @Override
    public String toString() {
        // Returns "Name: {name} Grade: {grade}"
        return String.format("Name: %s %s Grade: %d", this.firstName, this.lastName, this.grade);
    }


    // --- Getters & Setters --- //

    // - firstName =
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // - lastName -
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // - grade -
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // - studentID - studentID should be immutable, so setter is not defined
    public int getStudentID() {
        return studentID;
    }
}
