import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Ravi");
        students.put(102, "Anu");
        students.put(103, "Kiran");
        students.put(102, "Meena");       

        System.out.println("Name for 102: " + students.get(102));
        System.out.println("Has key 105? " + students.containsKey(105));
        System.out.println(students.getOrDefault(105, "Not found"));

        for (Map.Entry<Integer, String> e : students.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        Map<Integer, String> sorted = new TreeMap<>(students); 
        System.out.println("TreeMap: " + sorted);
    }
}
