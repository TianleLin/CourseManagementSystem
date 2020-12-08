package sample;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("01", "Zhang", "female", 20, "doctor");
        System.out.println(teacher.display());
    }
}
