//import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class StudentTest {
    public static void main(String[] args) throws IOException {
        String studentId;       //  Declaring student ID is string data-type
        String studentName;     //  Declaring student name is string data-type
        int studentAge;         //  Declaring student age is integer data-type
        
        //Scanner student = new Scanner(System.in);   //  Creating Scanner object named 'student'
        Student studentObj = new Student();         //  Creating Student object named 'studentObj'
        
        //System.out.print("Student ID: ");
        //studentId = student.nextLine();                     //  Asking user to input student ID
        studentId = JOptionPane.showInputDialog("Student ID", null);
        
        //System.out.print("Full Name: ");
        //studentName = student.nextLine();                   //  Asking user to input student name
        studentName = JOptionPane.showInputDialog("Full Name", null);
        
        //System.out.print("Age: ");
        //studentAge = Integer.parseInt(student.next());      //  Asking user to input student age
        studentAge = Integer.parseInt(JOptionPane.showInputDialog("Age", null));
        
        studentObj.setStudentId(studentId);         //  Setting student ID using user's entered ID
        studentObj.setStudentName(studentName);     //  Setting student name using user's entered name
        studentObj.setStudentCode(studentId, studentName);      //Setting student code using studentId & studentName as two arguments
        studentObj.setStudentAge(studentAge);       //  Setting student age using user's entered age
        
        System.out.println(studentObj);     //  Printing out default toString() constructor of Student class
        JOptionPane.showMessageDialog(null, studentObj, "Student Details", JOptionPane.PLAIN_MESSAGE);
        
        FileWriter file = new FileWriter("src/StudentInformation.txt");
        file.write("" + studentObj);
        file.close();
    }
}