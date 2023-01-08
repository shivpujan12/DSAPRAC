package Striver;

import java.util.ArrayList;

public class RecursionBasics {

//    public static long[] printFibb(int n) {
//        //Your code here
//        long[] sol = new long[n];
//        sol[0] = 1; sol[1] = 1;
//        return fibo(sol,n,0);
//    }

//    private static long[] fibo(long[] sol,int n) {
//
//    }

    int isPalindrome(String S) {
        // code here
        return checkPalin(S,0);
    }

    //helper function
    int checkPalin(String s,int i){
        if(i==s.length()){
            return 1;
        }

        if(s.charAt(i) != s.charAt(s.length()-i-1))
            return 0;

        return checkPalin(s,i+1);
    }

    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> sol = new ArrayList<Long>();
        getNumbers(N,sol,1,2);
        return sol;
    }

    //helper function
    private static void getNumbers(long n, ArrayList<Long> sol,long fact, int i) {
        if(fact>n);
        else{
            sol.add(fact);
            fact = getFact(i);
            getNumbers(n,sol,fact,i+1);
        }
    }

    //helper function
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
        System.out.print(isPalindrome("acba"));
    }
}
