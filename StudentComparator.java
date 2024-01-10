import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}

public class StudentComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(1, "Rajesh", 20);
        Student student2 = new Student(2, "Ranveer", 22);
        Student student3 = new Student(3, "Karan", 21);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        studentList.sort(new NameComparator());

        System.out.println("Students sorted by name:");
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
