package xyz.joedai.schoolproj;

import java.util.ArrayList;

/**
 * School class - defines a school
 * <br>
 * Holds basic information about the school (name, address, phone number) and a list of teachers, students, and courses.
 */
public class School {
    // --- Initialize variables --- //
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    private String name;
    private String address;
    private String phoneNumber;


    // --- Constructors --- //
    /**
     * Default constructor for Teacher class - sets all fields to "Undefined"
     */
    School() {
        // Set all to undefined
        this.name = "Undefined";
        this.address = "Undefined";
        this.phoneNumber = "Undefined";
    }

    /**
     * Parameterized constructor for School class
     *
     * @param name Name of the school
     * @param address Address of the school
     * @param phoneNumber Phone number of the school in format: ###-###-####
     */
    School(String name, String address, String phoneNumber) {
        // Standard constructor assignments
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    // --- Methods --- //
    /**
     * Adds a teacher to the ArrayList of teachers
     *
     * @param firstName First name of teacher
     * @param lastName Last name of teacher
     * @param subject Subject that the teacher teaches
     */
    public void addTeacher(String firstName, String lastName, String subject) {
        // Create a new Teacher object and add it to the teachers ArrayList
        Teacher teacherObj = new Teacher(firstName, lastName, subject);
        teachers.add(teacherObj);
    }

    /**
     * Adds a student ot the ArrayList of students
     *
     * @param firstName First name of student
     * @param lastName Last name of student
     * @param grade Current grade that the student is in
     */
    public void addStudent(String firstName, String lastName, int grade) {
        // Create a new Student object and add it to the students ArrayList
        Student studentObj = new Student(firstName, lastName, grade);
        students.add(studentObj);
    }

    /**
     * Removes a teacher from the ArrayList of teachers
     *
     * @param firstName First name of teacher
     * @param lastName Last name of teacher
     * @param subject Subject that the teacher teaches
     */
    public void removeTeacher(String firstName, String lastName, String subject) {
        // Create a new Teacher object with the given info...
        Teacher teacherObj = new Teacher(firstName, lastName, subject);

        // ...then use this new Teacher object to search for and remove the one in the teachers ArrayList
        teachers.remove(teacherObj);
    }

    /**
     * Removes a student ot the ArrayList of students
     *
     * @param firstName First name of student
     * @param lastName Last name of student
     * @param grade Current grade that the student is in
     */
    public void removeStudent(String firstName, String lastName, int grade) {
        // Create a new Student object with the given info...
        Student studentObj = new Student(firstName, lastName, grade);

        // ...then use this new Student object to search for and remove the one in the students ArrayList
        students.remove(studentObj);
    }

    /**
     * Prints a list of all the teachers in the school based on the toString() method of the Teacher class
     */
    public void printTeachers() {
        for (int i = 0; i < teachers.size(); i++ ) {
            Teacher teacherObj = teachers.get(i);
            System.out.println(teacherObj.toString());
        }
    }

    /**
     * Prints a list of all the students in the school based on the toString() method of the Student class
     */
    public void printStudents() {
        for (int i = 0; i < students.size(); i++ ) {
            Student studentObj = students.get(i);
            System.out.println(studentObj.toString());
        }
    }


    // --- Getters and Setters --- //
    // Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Address
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // Phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
