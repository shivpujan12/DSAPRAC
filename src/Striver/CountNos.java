package Striver;

public class CountNos {
    public void printNos(int N)
    {
        //Your code here
        if(N==0);

        else{
            printNos(N-1);
            System.out.print(N + " ");
        }
    }

    public void unitTest(){
        printNos(10);
    }
}
