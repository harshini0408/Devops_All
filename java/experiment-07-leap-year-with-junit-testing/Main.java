import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LeapYear l = new LeapYear();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (l.check(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

        sc.close();
    }
}
