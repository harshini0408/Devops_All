import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int u = sc.nextInt();

        double bill;

        if (u <= 100)
            bill = u * 1.50;
        else if (u <= 200)
            bill = 150 + (u - 100) * 2.50;
        else
            bill = 150 + 250 + (u - 200) * 4.00;

        System.out.println("Electricity Bill: Rs." + bill);

        sc.close();
    }
}
