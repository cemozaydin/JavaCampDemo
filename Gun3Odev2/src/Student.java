public class Student extends  User{
    private String studentNumber;

    public Student() {
    }

    public Student(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public Student(int id, String firstName, String lastName, String email, String password, String courseName, String studentNumber) {
        super(id, firstName, lastName, email, password, courseName);
        this.studentNumber = studentNumber;
    }
}
