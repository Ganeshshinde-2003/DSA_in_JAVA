import java.util.Arrays;

public class StringsTheory {
    public static void main(String[] args) {
        // String name = "Ganesh";
        // float num = 453.432432f;
        // // System.out.printf("Formatted number is %.2f\n", num);
        // // System.out.println(name);
        // String series = "";
        // StringBuilder builder = new StringBuilder();
        // for (int i = 0; i <= 25; i++) {
        // char ch = (char) ('a' + i);
        // System.err.println(ch);
        // series += ch;
        // builder.append(ch);
        // }
        // System.err.println(series);
        // System.err.println(builder.toString());

        // String name = "Ganesh Shinde";
        // System.err.println(Arrays.toString(name.toCharArray()));
        // System.err.println(name.toLowerCase());
        // System.err.println(name.indexOf("G"));
        // System.err.println(name.strip());
        // System.err.println(Arrays.toString(name.split((" "))));

        // Palindrome Program

        String str = "G";
        System.err.println(palin(str));

    }

    static boolean palin(String str) {
        str = str.toLowerCase();
        if (str.length() == 0 || str == null || str.length() == 1) {
            return true;
        }
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }

        return true;
    }
}
