public class Concept {
    static int sum = 0;
    public static void main(String[] args) {
        // revr(1234);
        System.err.println(palin(1122211));
    }

    static void revr(int n){
        if( n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        revr(n/10);
    }

    static int revr2(int n){
        int degits = (int)(Math.log10(n)) + 1;
        return helper(n, degits);
    }

    private static int helper(int n, int d){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, d - 1)) + helper(n/10, d-1);
    }

    static boolean palin(int n){
        return n == revr2(n);
    }
}
