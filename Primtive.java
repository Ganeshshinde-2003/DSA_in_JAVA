import java.util.Scanner;

public class Primtive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int rollno = input.nextInt();
        // System.out.println("Your roll no is " + rollno);
        // String name = input.nextLine();
        // System.out.println(name);

        // int num1 = input.nextInt();
        // int num2 = input.nextInt();

        // int num = input.nextInt();

        // System.out.println(num);

        // byte b = 50;
        // int c = b*2;

        // int num = 'a';
        // System.out.println(num);

        byte b = 42;
        char c = 'a';
        int i = 54;
        short s = 1024;
        float f = 12.44f;
        double d = 3.3232;
        double result = (f*b) + (i+c) - (d-s);

        System.out.println(result);
    }
}
