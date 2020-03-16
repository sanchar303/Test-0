public class Student {
    private String studentId;
    private String studentName;
    private int studentAge;
    
    public Student(String studentId, String studentName, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }
    
    public Student() {
        studentId = "________";
        studentName = "_______";
        studentAge = 0;
    }
    
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    
    @Override
    public String toString() {        
        return "\n" + studentName + " of age " + studentAge + "yrs with student ID " + studentId + ", is qualified for the above task.";
    }
}