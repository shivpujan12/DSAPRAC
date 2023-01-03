package Striver;

import java.util.ArrayList;

public class RecursionBasics {

    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> sol = new ArrayList<Long>();
        getNumbers(N,sol,1,2);
        return sol;
    }

    private static void getNumbers(long n, ArrayList<Long> sol,long fact, int i) {
        if(fact>n);
        else{
            sol.add(fact);
            fact = getFact(i);
            getNumbers(n,sol,fact,i+1);
        }
    }

    private static long getFact(int i) {
        if(i==1) return 1;
        return getFact(i-1) * i;
    }

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
        System.out.print(factorialNumbers(6));
    }
}
