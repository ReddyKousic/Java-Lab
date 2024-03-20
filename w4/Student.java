interface Department {
    String Dept_name = "";
    String Mentor_name = "";
    String Coordinator_name = "";
    String HOD_name = "";

    void displayDepartment();
}

interface Course {
    String course_name = "";

    void printCourse();
}

class Student implements Department, Course {
    String student_reg;
    String student_name;
    String Dept_name;
    String Mentor_name;
    String Coordinator_name;
    String HOD_name;
    String course_name;

    Student(String reg, String name, String dept, String mentor, String coordinator, String hod, String course) {
        student_reg = reg;
        student_name = name;
        Dept_name = dept;
        Mentor_name = mentor;
        Coordinator_name = coordinator;
        HOD_name = hod;
        course_name = course;
    }

    void printStudent() {
        System.out.println("Student Name : " + student_name);
        System.out.println("Student Reg : " + student_reg);

    }

    public void printCourse() {
        System.out.println("Student Course Name : " + course_name);

    }

    public void displayDepartment() {
        System.out.println("Student Dept. Name : " + Dept_name);
        System.out.println("Student Mentor Name : " + Mentor_name);
        System.out.println("Student Coordinator Name : " + Coordinator_name);
        System.out.println("Student HOD Name : " + HOD_name);

    }

    public static void main(String[] args) {
        // Creating an array of Student objects
        Student[] students = new Student[3];
        // Student(String reg, String name, String dept, String mentor, String
        // coordinator, String hod, String course)

        // Initializing Student objects
        students[0] = new Student("S001", "John Doe", "SCOPE", "Deepan", "Pasha", "Sharmila", "SWE");

        students[1] = new Student("S002", "Doe", "SCOPE", "Deepan", "Pasha", "Sharmila", "SWE");

        students[2] = new Student("S003", "John", "SCOPE", "Deepan", "Pasha", "Sharmila", "SWE");

        // Displaying student details, department details, and course name
        for (Student student : students) {
            student.printStudent();
            student.displayDepartment();
            student.printCourse();
            System.out.println();
        }
    }

}