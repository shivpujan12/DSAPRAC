import java.util.Arrays;

public class MergeSorte {
    int merge(int[] arr, int l, int m, int r) {
        int c=0;
        int[] left = new int[m+1 - l];
        int[] right = new int[r - (m)];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[l+i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[m+i+1];
        }

        int i=0,j=0,index = l;

        while(i<left.length && j< right.length){
            if(left[i]<=right[j]){
                arr[index] = left[i];
                i++;
            } else {
                if((long)arr[i] > (long)2*arr[j]){
                    c++;
                }
                arr[index] = right[j];
                j++;
            }
            index++;
        }

        while(i<left.length){
            arr[index] = left[i];
            i++; index++;
        }

        while (j<right.length){
            arr[index] = right[j];
            j++; index++;
        }

        return c;

    }

    int mergeSort(int[] arr, int l, int r,int c) {
        if (r - l > 0) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m,c);
            mergeSort(arr, m + 1, r,c);
            c+= merge(arr, l, m, r);
        }
        System.out.println(c + "c\n");
        return c;
    }

    public void unitTest() {
        int arr[] = {1, 3, 2, 3,1};
        int c = mergeSort(arr, 0, arr.length-1,0);
        System.out.println(Arrays.toString(arr) + " " + c);
    }
}
