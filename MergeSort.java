import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        
        int[] arr = {5,4,3,2,1,78,8,96,8,9};
        mergesortinPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right){

        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i<left.length && j < right.length) {
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }

 static void mergesortinPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return ;
        }

        int mid = s + ( e - s ) / 2;

        mergesortinPlace(arr, s, mid);
        mergesortinPlace(arr, mid, e);

        mergeInPlace(arr , s , mid, e );
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e){

        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i<m && j < e) {
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < arr.length) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[s+k2] = mix[k2];
        }
    }
}
