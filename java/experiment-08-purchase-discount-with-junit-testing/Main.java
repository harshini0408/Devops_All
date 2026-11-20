import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Discount d = new Discount();

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        System.out.println("Final Amount: " + d.calculate(amount));

        sc.close();
    }
}
