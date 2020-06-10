import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String studentId;       //  Declaring student ID is string data-type
        String studentName;     //  Declaring student name is string data-type
        int studentAge;         //  Declaring student age is integer data-type
        
        Scanner student = new Scanner(System.in);   //  Creating Scanner object named 'student'
        Student studentObj = new Student();         //  Creating Student object named 'studentObj'
        
        System.out.print("Student ID: ");
        studentId = student.nextLine();                     //  Asking user to input student ID
        
        System.out.print("Full Name: ");
        studentName = student.nextLine();                   //  Asking user to input student name
        
        System.out.print("Age: ");
        studentAge = Integer.parseInt(student.next());      //  Asking user to input student age
        
        studentObj.setStudentId(studentId);         //  Setting student ID using user's entered ID
        studentObj.setStudentName(studentName);     //  Setting student name using user's entered name
        studentObj.setStudentAge(studentAge);       //  Setting student age using user's entered age
        
        System.out.println(studentObj);     //  Printing out default toString() constructor of Student class
        student.close();
    }
}