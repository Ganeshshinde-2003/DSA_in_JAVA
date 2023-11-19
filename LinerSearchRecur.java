import java.util.ArrayList;

public class LinerSearchRecur {

    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6,67,89,99};
        // System.out.println(linear(arr, 99, 0));
        // linearAll(arr, 4, 0);
        // System.out.println(list.toString());;
        System.out.println(findAllIndex(arr, 4, 0));
    }

    static int linear(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index + 1;
        }
        return linear(arr, target, index + 1);
    }

     static void linearAll(int[] arr, int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index] == target){
            list.add(index);
        }
        linearAll(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFrom = findAllIndex(arr, target, index + 1);
        list.addAll(ansFrom);
        return list;
    }
}
