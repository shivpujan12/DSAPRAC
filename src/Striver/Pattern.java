package Striver;

public class Pattern {
    void printSquare(int n) {
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public void unitTest(){
        printSquare(5);
    }
}
