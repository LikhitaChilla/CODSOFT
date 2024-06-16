import java.io.Serializable;

public class Student implements Serializable {
    public String id;
    public String name;
    public int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', age=" + age + "}";
    }
}
