public class RecursionPrac {
    public static void main(String[] srgs){
        message(5);
    }

    static void message (int c) {
        if( c==0){
            return;
        }
        System.out.println("Hello World");
        message(c-1);
    }

    static void number (int n){
        if(n > 5){
            return;
        }
        System.out.println(n);
        number(n + 1);
    }
}
