import java.util.ArrayList;

public class ArrayListEmptyCheck {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        arrayList.add("Clover");
        arrayList.add("Infotech");

        if (arrayList.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }
    }
}
