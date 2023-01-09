package Helper;
import java.util.*;

/**
 * Sorter Class contains bubble sort,
 * insertion sort,selection sort merge sort
 * and quicksort in both technique iterative and recursive
 *
 * @author shivpujan
 *
 */
public class Sorter {
    //bubble sort
    int[] bubbleSortIter(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    //swap
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    int[] bubbleSortR(int[] arr,int i,int j){
        if(i==arr.length-1){
            return arr;
        }

        if(arr[j-1]>arr[j]){
            //swap
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
        }
        if(j==arr.length-i-1){
            i++;
            return bubbleSortR(arr,i,1);
        }
        j++;
        return bubbleSortR(arr,i,j);

    }

    int[] bubbleSortRecur(int[] arr){
        return bubbleSortR(arr,0,1);
    }

    //Selection Sort
    int[] selectionSortIter(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = arr[i];
            int minInd = i;
            for(int j=i+1; j<arr.length;j++){
                //search for minimum
                if(arr[j]<min){
                    minInd = j;
                    min = arr[j];
                }
            }
            //swap with the ith index
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        return arr;
    }

    int[] selectionSortR(int[] arr,int i,int j,int min,int minInd){
        if(i==arr.length-1){
            return arr;
        }

        //search minimum
        if(arr[j]<min){
            minInd = j;
            min = arr[j];
        }

        if(j==arr.length-1){
            //found minimum make swap
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
            i++;
            j = i+1;
            return selectionSortR(arr,i,j,arr[i],i);
        } else {
            //iterate for searching minimum
            j++;
            return selectionSortR(arr,i,j,min,minInd);
        }

    }
    int[] selectionSortRecur(int[] arr){
        return selectionSortR(arr,0,1,arr[0],0);
    }

    //Insertion Sort
    int[] insertionSortIter(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>key){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }
        return arr;
    }

    int[] insertionSortR(int[] arr,int i,int j,int key){

        if(j>0 && arr[j-1]>key){//iterate j
            arr[j] = arr[j-1];
            j--;
            return insertionSortR(arr,i,j,key);
        } else { //iterate i
            //make the swap with key
            arr[j] = key;
            i++;
            if(i==arr.length){//terminate
                return arr;
            }
            key = arr[i];
            j = i;

            return insertionSortR(arr,i,j,key);

        }


    }

    int[] insertionSortRecur(int[] arr){
        return insertionSortR(arr,1,1,arr[1]);
    }



    //unitTests
    public void unitTest(){
//        testBubble();
//        testSelection();
        testInsertion();

    }

    public void testInsertion(){
        int[] arr = insertionSortIter(new int[]{1, 4, 2, 3});
        System.out.println("Insertion Sort(Iterative): " + Arrays.toString(arr));
        arr = insertionSortRecur(new int[]{1, 4, 2, 3});
        System.out.println("Insertion Sort(Recursive): " + Arrays.toString(arr));
    }

    public void testSelection(){
        int[] arr = selectionSortIter(new int[]{1, 4, 2, 3});
        System.out.println("Selection Sort(Iterative): " + Arrays.toString(arr));
        arr = selectionSortRecur(new int[]{1, 4, 2, 3});
        System.out.println("Selection Sort(Recursive): " + Arrays.toString(arr));
    }


    public void testBubble(){
        int[] arr = bubbleSortIter(new int[]{1, 4, 2, 3});
        System.out.println("Bubble Sort(Iterative): " + Arrays.toString(arr));
        arr = bubbleSortRecur(new int[]{1, 4, 2, 3});
        System.out.println("Bubble Sort(Recursive): " + Arrays.toString(arr));
    }



}
