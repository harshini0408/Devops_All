import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println(s.checkResult(marks));

        sc.close();
    }
}
