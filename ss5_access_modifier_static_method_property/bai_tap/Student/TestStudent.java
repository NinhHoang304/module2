package ss5_access_modifier_static_method_property.bai_tap.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Nguyen van A");
        student.setClasses("C09");
        Student.change();
        System.out.println(student.toString());
    }
}
