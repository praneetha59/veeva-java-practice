import java.util.*;

public class CollectionApiDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Ravi");
        names.add("Anu");
        names.add("Kiran");

        System.out.println("Size: " + names.size());
        System.out.println("Contains Anu? " + names.contains("Anu"));

        names.remove("Ravi");
        System.out.println("After remove: " + names);

        for (String n : names) {
            System.out.println(n);
        }

        names.clear();
        System.out.println("Is empty? " + names.isEmpty());
    }
}
