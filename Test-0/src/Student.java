public class Student {
    private String studentId;
    private String studentName;
    private int studentAge;
    private String studentCode;
    
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
    
    public String getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(String studentId, String studentName) {
        this.studentCode = this.studentName.substring(0, this.studentName.length() / 4) + this.studentName.substring(this.studentName.length() - this.studentName.length() / 4) + this.studentId.substring(this.studentId.length() - this.studentId.length() / 2);
    }
    
    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    
    @Override
    public String toString() {        
        //return "\n" + studentName + " of age " + studentAge + "yrs with student ID " + studentId + ", is qualified for the above task.";
        return "Student Code : " + studentCode + "\n" + "Student ID : " + studentId + "\n" + "Student Name : " + studentName + "\n" + "Age : " + studentAge + "\n" + "(Eligible)";
    }
}