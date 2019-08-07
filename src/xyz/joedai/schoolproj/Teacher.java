package xyz.joedai.schoolproj;

public class Teacher {
    // --- Initialize variables --- //
    private String firstName;
    private String lastName;
    private String subject;


    // --- Constructor --- //
    Teacher(String firstName, String lastName, String subject) {
        // Standard constructor assignments
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }


    // --- Main methods --- //

    // - object as a string -
    @Override
    public String toString() {
        // Returns "Name: {name} Subject: {subject}"
        return String.format("Name: %s %s Subject: %s", this.firstName, this.lastName, this.subject);
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

    // - subject -
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
