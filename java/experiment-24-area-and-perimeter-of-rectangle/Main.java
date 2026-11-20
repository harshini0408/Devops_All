import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        double area = l * b;
        double perimeter = 2 * (l + b);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        sc.close();
    }
}
