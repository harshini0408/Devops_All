import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 subject marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double avg = (a + b + c) / 3.0;

        System.out.println("Average: " + avg);

        if (avg >= 90)
            System.out.println("Grade A");
        else if (avg >= 75)
            System.out.println("Grade B");
        else if (avg >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Grade F");

        sc.close();
    }
}
