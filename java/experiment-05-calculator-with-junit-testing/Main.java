import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.subtract(a, b));
        System.out.println("Multiplication: " + c.multiply(a, b));

        try {
            System.out.println("Division: " + c.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
