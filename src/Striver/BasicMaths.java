package Striver;

public class BasicMaths {

    int countDigits(int n){
        //Approach 1
        /*int count = 0;
        int k = n/10;
        while(k>0){
            count++;
            k = k/10;
        }
        return ++count;*/

        //Approach 2
        String s = String.valueOf(n);
        return s.length();
    }

    int evenlyDivides(int N){
        // code here
        int count = 0;
        int rem = N%10;
        int k = N/10;
        while(k>0){
            if(rem!=0 && N%rem==0){
                count++;
            }
            rem = k%10;
            k = k/10;
        }
        return ++count;
    }

    public int reverse(int x) {
//        Approach 1
        int flag = 1;
        if(x<0){
            flag = -1;
            x = Math.abs(x);
        }
        String s = String.valueOf(x);
        String rev  = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            rev = c + rev;
        }
        try{
            return Integer.parseInt(rev)*flag;
        } catch(Exception e) {
            return 0;
        }

        //Approach 2

    }

    public void unitTest(){
        System.out.print(evenlyDivides(26345));
    }

}
