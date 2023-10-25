import java.util.Scanner;

public class Linera {
    public static void main(String[] args) {
        
    }

    static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i< arr.length ; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
