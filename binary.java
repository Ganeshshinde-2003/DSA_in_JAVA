public class binary {
    public static void main(String[] args) {
        // int[] arr = { 434543, 654, 43, 2, 1, 0, -1, -2 };

        // int ans = binarySearch(arr, 654);

        // System.out.println("Found at " + ans);

        System.out.println(Math.round(Math.sqrt(8)));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean check = arr[end] > arr[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (check) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}