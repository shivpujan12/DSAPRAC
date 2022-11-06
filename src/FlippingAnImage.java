import java.util.Arrays;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0; row < image.length; row++) {
            image[row] = reverse(image[row]);
            for (int col = 0; col < image[0].length; col++) {
                image[row][col] ^= 1;

            }
        }
        return image;
    }

    private int[] reverse(int[] row) {
        int[] original = row.clone();
        for(int i=0; i<row.length;i++){
            row[i] = original[original.length-(i+1)];
        }
        return row;
    }

    public void unitTest(){
        FlippingAnImage fp = new FlippingAnImage();
        int[][] sol = fp.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        for (int row = 0; row < sol.length; row++) {
            for (int col = 0; col < sol[0].length; col++) {
                System.out.print(sol[row][col] + ",");
            }
            System.out.println();
        }
    }
}
