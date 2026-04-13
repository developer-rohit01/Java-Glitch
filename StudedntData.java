  //Program to demonstrate the use of  multiple interfaces and making student management system
  interface Student {
    void displayStudentDetails();
}

interface Course {
    void displayCourseDetails();
}

interface Grade {
    void displayGradeDetails();
}

class StudentManagementSystem implements Student, Course, Grade {
    private String studentName;
    private String courseName;
    private String grade;

    public StudentManagementSystem(String studentName, String courseName, String grade) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.grade = grade;
    }
   
    @Override
    public void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
    }

    @Override
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
    }

    @Override
    public void displayGradeDetails() {
        System.out.println("Grade: " + grade);
    }
}

public class StudedntData {
    public static void main(String[] args) {
        StudentManagementSystem student1 = new StudentManagementSystem("Rohit", "Computer Science", "A");
        student1.displayStudentDetails();  
        student1.displayCourseDetails();
        student1.displayGradeDetails();
    }
}


