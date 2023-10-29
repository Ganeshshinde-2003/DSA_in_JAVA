public class Pattern {
    public static void main(String[] args) {
        pattern31(5);
    }

    static void pattern31(int n) {
        int original = n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int atEveryIndex = original - Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.err.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("* ");
            }
            System.err.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.err.println();
        }
    }

    static void pattern3(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.err.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", j);
            }
            System.err.println();
        }
    }

    static void pattern5(int n) {
        int c = 1;
        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j <= c; j++) {
                System.err.print("* ");
            }
            if (i < n) {
                c++;

            } else {
                c--;
            }
            System.err.println();
        }
    }

    static void pattern28(int n) {
        int c = 1;
        for (int i = 1; i < 2 * n; i++) {
            int nos = n - c;
            for (int s = 0; s < nos; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
                System.err.print("* ");
            }
            if (i < n) {
                c++;

            } else {
                c--;
            }
            System.err.println();
        }
    }

    static void pattern30(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int c = i > n ? 2 * n - i : i;
            for (int s = 0; s < n - c; s++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}