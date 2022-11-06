import java.util.Arrays;

public class SelectionSort {

    public void selection_sort(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            int min = i;
            int j = i+1;
            while(j< arr.length){
                if(arr[min]>arr[j]){
                    min = j;
                }
                j++;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public void unitTest(){
        int[] arr = {13,46,24,52,20,9};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
