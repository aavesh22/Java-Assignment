import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");
        hashMap.put("D", "Date");

        System.out.println("Elements in the HashMap:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
