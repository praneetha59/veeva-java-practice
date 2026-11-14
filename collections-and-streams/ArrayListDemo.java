import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(80);
        marks.add(65);
        marks.add(92);
        marks.add(65);            
        System.out.println(marks);

        marks.add(1, 70);           
        marks.set(0, 85);              
        System.out.println("Index 2: " + marks.get(2));
        System.out.println("Index of 92: " + marks.indexOf(92));

        marks.remove(Integer.valueOf(65));  
        System.out.println(marks);

        for (int i = 0; i < marks.size(); i++) {
            System.out.println("marks[" + i + "] = " + marks.get(i));
        }
    }
}
