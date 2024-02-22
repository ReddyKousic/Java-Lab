

/*

   Write a  Student class with the following details, 
   attributes : name, mark1, mark2, mark3, total, grade
   methods : set_details(), total_mark(), grade_cal()
   create 5 student objects and assign marks for them through 
   set_details mehtod and find the total and grade of each student and print the details of all the students


   if avg > 90  ----- S grade
   if avg > 80  ----- A grade
   if avg > 70  ----- B grade
   if avg > 60  ----- C grade
   if avg > 50  ----- D grade
   Everything else is Fail.





 */

public class Student {
    String name;
    int mark1;
    int mark2;
    int mark3;
    int total;
    char grade;

    public void setDetails(String name, int mark1, int mark2, int mark3) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public void calculateTotal() {
        this.total = mark1 + mark2 + mark3;
    }

    public void calculateGrade() {
        int average = total / 3;

        if (average > 90) {
            this.grade = 'S';
        } else if (average > 80) {
            this.grade = 'A';
        } else if (average > 70) {
            this.grade = 'B';
        } else if (average > 60) {
            this.grade = 'C';
        } else if (average > 50) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total: " + total);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student1.setDetails("John", 85, 90, 88);
        student1.calculateTotal();
        student1.calculateGrade();
        student1.printDetails();

        student2.setDetails("Alice", 78, 85, 82);
        student2.calculateTotal();
        student2.calculateGrade();
        student2.printDetails();

        student3.setDetails("Bob", 92, 88, 95);
        student3.calculateTotal();
        student3.calculateGrade();
        student3.printDetails();

        student4.setDetails("Emily", 70, 75, 68);
        student4.calculateTotal();
        student4.calculateGrade();
        student4.printDetails();

        student5.setDetails("Michael", 45, 55, 50);
        student5.calculateTotal();
        student5.calculateGrade();
        student5.printDetails();
    }
}
