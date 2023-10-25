public class Find {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,3,1};

        int peak = peakElement(a);

        int left = leftSearch(a, peak);

        if(left == -1){
            int right = rightSearch(a, left);
            System.out.println(right);
            return;
        }
        System.out.println(left);
        // int start = leftSearch(a,peak);
    }

    static int peakElement(int[] nums){
        int s = 0;
        int e = nums.length - 1;

        while(s < e) {
            int mid = s + (e - s) / 2;

            if(nums[mid] > nums[mid + 1]){
                e = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
    static int leftSearch(int[] a, int e){
        int s = 0;
        
        while(s < e){
            int m = s + (e - s) / 2;

            if(a[m] == 2){
                return m;
            } else if(a[m] < 2){
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
    static int rightSearch(int[] a, int e){
        int s = e + 1;
        int end = a.length - 1;
        while(s < end){
            int m = s + (end - s) / 2;

            if(a[m] == 2){
                return m;
            } else if(a[m] > 2){
                s = m + 1;
            } else {
                end = m - 1;
            }
        }
        return -1;
    }
}