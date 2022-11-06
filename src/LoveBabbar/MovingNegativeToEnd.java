package LoveBabbar;

import java.util.Arrays;

public class MovingNegativeToEnd {

    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int i=0,j=arr.length-1;
        while(i<j){
            while(arr[i]>0){
                i++;
            }
            while(arr[j]<0){
                j--;
            }
            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void unitTest(){
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr, arr.length);
    }
}
