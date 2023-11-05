public class FlipImage {
    public int[][] flipinver(int[][] image){
        for(int[] row: image){
            for(int i = 0; i < (image[0].length + 1) /2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - 1 -i];
                row[image[0].length - 1 -i] = temp;
            }
        }

        return image;
    }
}
