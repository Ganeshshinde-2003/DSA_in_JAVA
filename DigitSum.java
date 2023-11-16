public class DigitSum {
    public static void main(String[] args){
        System.err.println(mul(123456));
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        } 
        return (n % 10) + sum(n/10);
    }

    static int mul(int n){
        if(n%10 == n){
            return n;
        } 
        return (n % 10) * mul(n/10);
    }
}
