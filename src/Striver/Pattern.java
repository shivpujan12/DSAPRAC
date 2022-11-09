package Striver;

public class Pattern {

    //pattern1
    void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    //pattern2
    void printTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern3
    void printTriangleNum(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //pattern 4
    void printTriangleNum2(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    //pattern 5
    void printUpperTriangle3(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //patter 6
    void printUpperTriangleNum(int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //patter 7
    void printMidTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //pattern 8
    void printRMidTriangle(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= (2 * (n - i + 1) - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    //patter 9
    void printDiamond(int n) {
        //for upper triangle
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //for lower triangle
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            //print star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    //pattern 10
    void printSideTriangle(int n) {
        //upper left triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //lower left triangle
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //pattern 11
    void print101Triangle(int n) {
        // code here
        int flagJ = 1; //will flip alternatively
        int flagI = 0; //will flip alternatively

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(flagJ + " ");
                flagJ = (flagJ == 0) ? 1 : 0;
            }
            flagJ = flagI;
            flagI = (flagI == 0) ? 1 : 0;
            System.out.println();
        }
    }

    //pattern 12
    void printOpposingTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            //print nos. of first half
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            //print spaces in between
            for (int j = 1; j <= 4 * (n - i); j++) {
                System.out.print(" ");
            }

            //print nos. of second half
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //pattern 13
    void printCountingTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();

        }
    }

    //pattern 14
    void printABCTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int l = j + 64;
                System.out.print((char) l);
            }
            System.out.println();

        }
    }

    //pattern 15
    void printRABCTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                int l = j + 64;
                System.out.print((char) l);
            }
            System.out.println();

        }
    }

    //pattern 16
    void printABCITriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int l = i + 64;
                System.out.print((char) l);
            }
            System.out.println();

        }
    }

    //pattern 17
    void printMidABCTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            //print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //print Alphabet
            int upperLimit = (int) ((2 * i - 1) / 2) + 1;
            int reverse = upperLimit;
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j > upperLimit) {
                    System.out.print((char) (--reverse + 64));
                } else {
                    System.out.print((char) (j + 64));
                }
            }
            System.out.println(" ");
        }
    }

    //pattern 18
    void printABCLeftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int l = (n - j + 1) + 64;
                System.out.print((char) l + " ");
            }
            System.out.println();

        }
    }

    //patter 19
    void printOutDiamond(int n) {
        //upper
        for (int i = 0; i < n; i++) {
            //left corner
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            //right corner
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower
        for (int i = 0; i < n; i++) {
            //left corner
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            //right corner
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //patter 20
    void printROutDiamond(int n) {
        //lower
        for (int i = 0; i < n; i++) {
            //left corner
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            //right corner
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //upper
        for (int i = 1; i < n; i++) {
            //left corner
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            //right corner
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pattern 21
    void printStarSquare(int n) {
        // code here
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                for(int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    //pattern 22
    void printCircularNumSquare(int n) {
        int i=0;
        int j=1;
        while(i<2*n-1){
            int temp = n;
            int time = i;
            j=1;
            while(j<2*n){
                System.out.print(temp);
                if(time>0){
                    time--;
                    temp = temp-time;
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public void unitTest() {
        printCircularNumSquare(3);
    }
}
