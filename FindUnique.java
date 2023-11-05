public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2,6,4};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int uni = 0;

        for (int n: arr){
            uni = uni ^ n; // 00=0 11=0 01=1 10=1
        }

        return uni;
    }
}
