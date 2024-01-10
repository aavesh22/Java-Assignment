import java.time.LocalDate;

public class StudentTwos {
    private int id;
    private String name;
    private int age;
    private LocalDate dateOfJoining;

    public StudentTwos(int id, String name, int age, LocalDate dateOfJoining) {
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
        StudentTwos student1 = new StudentTwos(1, "Rajesh", 20, LocalDate.of(2022, 9, 15));
        StudentTwos student2 = new StudentTwos(2, "Deepak", 22, LocalDate.of(2021, 12, 10));
        StudentTwos student3 = new StudentTwos(3, "Rahul", 21, LocalDate.of(2023, 3, 25));

        System.out.println("Student 1:");
        System.out.println("ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Date of Joining: " + student1.getDateOfJoining());

        System.out.println("\nStudent 2:");
        System.out.println("ID: " + student2.getId());
        System.out.println("Name: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Date of Joining: " + student2.getDateOfJoining());

        System.out.println("\nStudent 3:");
        System.out.println("ID: " + student3.getId());
        System.out.println("Name: " + student3.getName());
        System.out.println("Age: " + student3.getAge());
        System.out.println("Date of Joining: " + student3.getDateOfJoining());
    }
}
