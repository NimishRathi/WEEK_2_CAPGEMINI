package level01;

public class OnlineCourseManagement {
    // Instance Variables
    private String courseName;
    private int duration;
    private double fee;

    // Class Variable (common for all courses)
    private static String instituteName = "XYZ Institute";

    // Constructor to initialize course details
    public OnlineCourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Create Course objects
        OnlineCourseManagement course1 = new OnlineCourseManagement("Java Programming", 6, 300);
        OnlineCourseManagement course2 = new OnlineCourseManagement("Data Science", 12, 500);
        OnlineCourseManagement course3 = new OnlineCourseManagement("Web Development", 9, 350);

        // Display individual course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        System.out.println("Course 3 Details:");
        course3.displayCourseDetails();
        System.out.println();

        // Update the institute name for all courses
        OnlineCourseManagement.updateInstituteName("ABC ");

        // Display updated course details
        System.out.println("After updating the institute name: ");

        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();
        System.out.println();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
        System.out.println();

        System.out.println("Course 3 Details:");
        course3.displayCourseDetails();
        System.out.println();
    }
}

