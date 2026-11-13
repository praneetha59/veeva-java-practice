
public class ExceptionHierarchy {
    public static void main(String[] args) {

        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
        catch (Exception e) {
            System.out.println("General Exception");
        }

        System.out.println("Program completed");
    }
}
