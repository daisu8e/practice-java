public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Daisuke");
        student.setAge(37);
        student.setStudentId("12345");
        student.setGender("Mail");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Gender: " + student.getGender());
    }
}
