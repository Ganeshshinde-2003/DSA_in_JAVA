public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(0);
        System.out.println(1);
        for(int i=2; i< 10; i++){
        System.out.println(fibo(i));
        }
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo( n-2);
    }
}
