import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter first no: ");
        num1 = in.nextInt();
        System.out.println("Enter first no: ");
        num2 = in.nextInt();
        System.out.println(sum(num1, num2));
    }

    static int sum(int num1, int num2) {
        int sum;

        sum = num1 + num2;

        System.out.print("The sum is => ");
        return sum;
    }
}