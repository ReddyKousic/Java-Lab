// Department interface
interface Department {
    String getDeptName();
    String getMentorName();
    String getCoordinatorName();
    String getHODName();
    void displayDepartment();
}

// Course interface
interface Course {
    String getCourseName();
    void printCourse();
}

// Student class implementing Department and Course interfaces
class Student implements Department, Course {
    private String studentReg;
    private String studentName;
    private String deptName;
    private String mentorName;
    private String coordinatorName;
    private String hodName;
    private String courseName;

    // Constructor
    public Student(String studentReg, String studentName, String deptName, String mentorName, 
                   String coordinatorName, String hodName, String courseName) {
        this.studentReg = studentReg;
        this.studentName = studentName;
        this.deptName = deptName;
        this.mentorName = mentorName;
        this.coordinatorName = coordinatorName;
        this.hodName = hodName;
        this.courseName = courseName;
    }

    // Department interface methods
    public String getDeptName() {
        return deptName;
    }

    public String getMentorName() {
        return mentorName;
    }

    public String getCoordinatorName() {
        return coordinatorName;
    }

    public String getHODName() {
        return hodName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        System.out.println("Mentor: " + mentorName);
        System.out.println("Coordinator: " + coordinatorName);
        System.out.println("HOD: " + hodName);
    }

    // Course interface methods
    public String getCourseName() {
        return courseName;
    }

    public void printCourse() {
        System.out.println("Course: " + courseName);
    }

    // Student class methods
    public void setStudent(String studentReg, String studentName) {
        this.studentReg = studentReg;
        this.studentName = studentName;
    }

    public void printStudent() {
        System.out.println("Student Registration: " + studentReg);
        System.out.println("Student Name: " + studentName);
    }
}

public class SS {
    public static void main(String[] args) {
        // Creating array of n objects of Student class
        int n = 3; // Number of students
        Student[] students = new Student[n];
        
        // Initializing students
        students[0] = new Student("001", "John Doe", "Computer Science", "Mr. Smith", "Ms. Johnson", "Dr. Lee", "Java Programming");
        students[1] = new Student("002", "Jane Doe", "Electrical Engineering", "Dr. Johnson", "Ms. Smith", "Dr. Brown", "Circuit Analysis");
        students[2] = new Student("003", "Alice Smith", "Mechanical Engineering", "Mr. White", "Mrs. Brown", "Dr. Green", "Thermodynamics");
        
        // Displaying details of all students
        for (Student student : students) {
            student.printStudent();
            student.displayDepartment();
            student.printCourse();
            System.out.println();
        }
    }
}
