import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private LocalDate dateOfJoining;

    public Student(int id, String name, int age, LocalDate dateOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfJoining = dateOfJoining;
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

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(1, "Rajesh", 20, LocalDate.of(2022, 9, 15));
        Student student2 = new Student(2, "Ranveer", 22, LocalDate.of(2021, 12, 10));
        Student student3 = new Student(3, "Yash", 21, LocalDate.of(2023, 3, 25));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student student : studentList) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Date of Joining: " + student.getDateOfJoining());
            System.out.println(); 
        }
    }
}
