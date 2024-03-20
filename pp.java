// Department interface
interface Department {
    String Dept_name = "";
    String Mentor_name = "";
    String Coordinator_name = "";
    String HOD_name = "";

    void displayDepartment();
}

// Course interface
interface Course {
    String course_name = "";

    void printCourse();
}

// Student class implementing Department and Course interfaces
class Student implements Department, Course {
    String student_reg;
    String student_name;
    String Dept_name;
    String Mentor_name;
    String Coordinator_name;
    String HOD_name;
    String course_name;

    // Constructor
    Student(String student_reg, String student_name) {
        this.student_reg = student_reg;
        this.student_name = student_name;
    }

    // Setter method to set student details
    void setStudent(String student_reg, String student_name) {
        this.student_reg = student_reg;
        this.student_name = student_name;
    }

    // Method to print student details
    void printStudent() {
        System.out.println("Student Registration: " + student_reg);
        System.out.println("Student Name: " + student_name);
    }

    // Method to display department details
    public void displayDepartment() {
        System.out.println("Department Name: " + Dept_name);
        System.out.println("Mentor Name: " + Mentor_name);
        System.out.println("Coordinator Name: " + Coordinator_name);
        System.out.println("HOD Name: " + HOD_name);
    }

    // Method to print course name
    public void printCourse() {
        System.out.println("Course Name: " + course_name);
    }
}

public class pp {
    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];

        // Initializing Student objects
        students[0] = new Student("S001", "John Doe");
        students[0].Dept_name = "Computer Science";
        students[0].Mentor_name = "Jane Smith";
        students[0].Coordinator_name = "Michael Johnson";
        students[0].HOD_name = "Emily Brown";
        students[0].course_name = "Java Programming";

        students[1] = new Student("S002", "Alice Williams");
        students[1].Dept_name = "Electrical Engineering";
        students[1].Mentor_name = "Bob Thompson";
        students[1].Coordinator_name = "Sarah Davis";
        students[1].HOD_name = "David Wilson";
        students[1].course_name = "Digital Circuits";

        students[2] = new Student("S003", "Tom Taylor");
        students[2].Dept_name = "Mechanical Engineering";
        students[2].Mentor_name = "Mary Anderson";
        students[2].Coordinator_name = "Robert Thomas";
        students[2].HOD_name = "Jessica Garcia";
        students[2].course_name = "Thermodynamics";

        // Displaying student details, department details, and course name
        for (Student student : students) {
            student.printStudent();
            student.displayDepartment();
            student.printCourse();
            System.out.println();
        }
    }
}