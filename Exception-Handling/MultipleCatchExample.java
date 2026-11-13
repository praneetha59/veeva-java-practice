
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
            int result = 10 / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");

        } catch (Exception e) {
            System.out.println("Some other error occurred");
        }
        System.out.println("Program completed");
    }
}
