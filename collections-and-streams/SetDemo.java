import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();           
        Set<String> linkedSet = new LinkedHashSet<>();   
        Set<String> treeSet = new TreeSet<>();           

        String[] data = {"banana", "apple", "cherry", "apple"};

        for (String s : data) {
            hashSet.add(s);
            linkedSet.add(s);
            treeSet.add(s);
        }

        System.out.println("HashSet:       " + hashSet);
        System.out.println("LinkedHashSet: " + linkedSet);
        System.out.println("TreeSet:       " + treeSet);
        System.out.println("Duplicate added? " + hashSet.add("apple"));   // false
    }
}
