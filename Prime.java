public class Prime {
    public static void main(String[] args) {
        int num = 20;
        for(int i=1; i<=num; i++){
            System.out.println("The number " + i + " is " + primNum(i));
        }
    }
    
    static boolean primNum(int n){
        for(int i=2;i  * i <=n ;i++){
            if(n%i == 0){
                return false;
            } 
        }
        return true;
    }
}
