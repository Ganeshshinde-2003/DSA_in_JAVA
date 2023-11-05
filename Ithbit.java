public class Ithbit {
    public static void main(String[] args) {
        int num = 100;
        System.err.println(ithBit(num, 5));
    }
    static int ithBit(int num, int n){
        return (num & (1 << (n -1)));
    }

    
}
