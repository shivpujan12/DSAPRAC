package Striver;

public class RecursionBasics {
    public void printNos(int N)
    {
        //Your code here
        if(N==0);

        else{
            printNos(N-1);
            System.out.print(N + " ");
        }
    }

    void printGfg(int N) {
        // code here
        if(N==0);
        else{
            System.out.print("GFG ");
            printGfg(N-1);
        }
    }

    void printNosReverse(int N) {
        // code here
        if(N==0);
        else{
            System.out.print(N + " ");
            printNosReverse(N-1);

        }
    }

    long sumOfSeries(long N) {
        // code here
        return (N+1)*(N+1)*(N)*(N) / 4;
    }

    public void unitTest(){
        printNos(10);
    }
}
