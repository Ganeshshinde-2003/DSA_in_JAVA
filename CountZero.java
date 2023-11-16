public class CountZero {
    public static void main(String[] args) {
        System.err.println(step(14));
    }

    static int count(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }

    static int step(int n){
        return helper2(n, 0);
    }
    private static int helper2(int n, int steps){
        if(n == 0){
            return steps;
        }
        if( n%2 == 0){
            return helper2(n/2, steps+1);
        }
        return helper2(n-1, steps+1);
    }
}
