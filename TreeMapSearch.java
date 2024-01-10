import java.util.TreeMap;

public class TreeMapSearch {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        int keyToSearch = 3;

        if (treeMap.containsKey(keyToSearch)) {
            System.out.println("Key " + keyToSearch + " is present in the TreeMap.");
        } else {
            System.out.println("Key " + keyToSearch + " is not found in the TreeMap.");
        }
    }
}
