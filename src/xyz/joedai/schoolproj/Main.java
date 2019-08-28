package xyz.joedai.schoolproj;

/**
 * Main class - used to test/use the School, Teacher, Student classes, as per the criteria
 */
public class Main {
    public static void main(String[] args) {
        // Let's try using the classes!

        // Create a new school object
        School sentinel = new School(
                "Vancouver Learning Network",
                "530 E 41st Ave, Vancouver, BC, Canada",
                "604-713-5520"
        );

        // Add 10 students (names and grades were generated randomly
        sentinel.addStudent("Lorie","Uilleam", 9);
        sentinel.addStudent("Zane","Jerrod",10);
        sentinel.addStudent("Darrin","Corinna", 12);
        sentinel.addStudent("Sarah","Jesse",8);
        sentinel.addStudent("Duff","Rosa",11);
        sentinel.addStudent("Addison","Cordell",9);
        sentinel.addStudent("Stacy","Floretta",10);
        sentinel.addStudent("Arran","Carlton",9);
        sentinel.addStudent("Orson","Meagan",12);
        sentinel.addStudent("Royston","Marilou",12);

        // Add 3 teachers (names were generated randomly)
        sentinel.addTeacher("Arlene","Andie","Science");
        sentinel.addTeacher("Molly","Sherilyn","English");
        sentinel.addTeacher("Stuart","Jed","Social Studies");

        // Print both lists
        System.out.println("\nStudents:\n------");
        sentinel.printStudents();
        System.out.println("\nTeachers:\n------");
        sentinel.printTeachers();

        // Remove 2 students
        sentinel.removeStudent("Addison","Cordell",9);
        sentinel.removeStudent("Arran","Carlton",9);

        // Remove 1 teacher
        sentinel.removeTeacher("Molly","Sherilyn","English");

        // Print both lists
        System.out.println("\nStudents after removal:\n------");
        sentinel.printStudents();
        System.out.println("\nTeachers after removal:\n------");
        sentinel.printTeachers();
    }
}
