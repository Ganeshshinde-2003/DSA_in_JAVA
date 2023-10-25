public class Shadwoing {
    static int x = 100;

    public static void main(String[] args) {
        System.out.println(x);
        x = 40;
        System.out.println(x);
        fun(2, 3, 4343, 54, 5, 65, 6566);
    }

    static void fun(int... v) {
        System.out.println(x);
    }
}
