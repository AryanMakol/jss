public class Student {
    public Student(String studentName, int studentId,
                   String courseName, double gpa)
    {
        super();
        this.studentName = studentName;
        this.studentId = studentId;
        this.courseName = courseName;
        this.gpa = gpa;
    }
    public Student()
    {
        // via setter methods, rest fields are done
    }
    String studentName;
    int studentId;
    String courseName;
    double gpa;
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
