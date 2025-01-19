class task3{
public class Student;
public static void main(String []args);
    private String name;
    private int age;
    private double gpa;
    private char gender;
    private boolean isForeigner;
    private String studentID;

    public Student(String name, int age, double gpa, char gender, boolean isForeigner, String studentID) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.gender = gender;
        this.isForeigner = isForeigner;
        this.studentID = studentID;
    }
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa +
                ", gender=" + gender + ", isForeigner=" + isForeigner +
                ", studentID='" + studentID + "'}";
    }
}