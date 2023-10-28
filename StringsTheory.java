public class StringsTheory {
    public static void main(String[] args) {
        String name = "Ganesh";
        float num = 453.432432f;
        // System.out.printf("Formatted number is %.2f\n", num);
        // System.out.println(name);
        String series = "";
        for (int i = 0; i <= 25; i++) {
            char ch = (char) ('a' + i);
            System.err.println(ch);
            series += ch;
        }
        System.err.println(series);
    }
}
