package ss5_access_modifier_static_method_property.bai_tap.Student;

public class Student {
    public static String age ="1";
    private String name = "John";
    private String classes = "CO2";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public static  void change() {
        age = "6";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                age+
                '}';
    }
}
