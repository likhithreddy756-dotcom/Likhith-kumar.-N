public class Main {
    public static void main(String[] args) {

        try {
            // Arithmetic exception
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);

            // Array index out of bounds exception
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: Invalid array index.");
        }

        finally {
            System.out.println("Finally block is always executed.");
        }
    }
}
