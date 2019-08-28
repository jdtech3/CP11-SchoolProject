package xyz.joedai.schoolproj;

/**
 * Teacher class - defines a teacher in a School
 * <br>
 * Holds basic information about teacher (first name, last name, subject that he/she teaches).
 * <br>
 * toString() method prints out the above information in a human-readable way
 */
public class Teacher {
    // --- Initialize variables --- //
    private String firstName;
    private String lastName;
    private String subject;


    // --- Constructors --- //
    /**
     * Default constructor for Teacher class - sets all fields to "Undefined"
     */
    Teacher() {
        // Set all to undefined
        this.firstName = "Undefined";
        this.lastName = "Undefined";
        this.subject = "Undefined";
    }

    /**
     * Parameterized constructor for Teacher class
     *
     * @param firstName First name of the teacher
     * @param lastName Last name of the teacher
     * @param subject Subject that the teacher teaches
     */
    Teacher(String firstName, String lastName, String subject) {
        // Standard constructor assignments
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }


    // --- Methods --- //
    /**
     * Returns a string with information about the teacher
     *
     * @return string with the name of the teacher and subject he/she teaches
     */
    @Override
    public String toString() {
        // Returns "Name: {name} Subject: {subject}"
        return String.format("Name: %s %s Subject: %s", this.firstName, this.lastName, this.subject);
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

    // Subject
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
