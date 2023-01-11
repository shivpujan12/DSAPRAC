package RandomQuestions;

public class HammingDistance {
    public int hammingWeight(int n) {
        //append 0 to the n
        n = Integer.parseInt('0' + String.valueOf(n));
        int count=0;
        while (n > 0) {
            int k = n % 2;
            if(k==1){
                count++;
            }
            n = n / 2;
        }
        return count;
    }
    public void unitTest(){
        int n = 11111101;
        System.out.println(hammingWeight(n));
    }

}
