package NirankariSheet;
import Helper.Sorter;
import java.util.*;

public class SortingQuestions {
    public int minimumSum(int num) {
        int arr[] = new int[4];
        int i=0;
        while(num>0){
            arr[i++] = num%10;
            num = num/10;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int num1 = arr[0]*10 + arr[2];
        int num2 = arr[1]*10 + arr[3];
        return num1+num2;
    }

    public void unitTest(){
        System.out.print(minimumSum(2932));
    }
}
