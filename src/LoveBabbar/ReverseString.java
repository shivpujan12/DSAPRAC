package LoveBabbar;

public class ReverseString {

    public String reverseWord(String str)
    {
        char[] chars = str.toCharArray();
        reverse(chars,0,str.length()-1);
        return String.valueOf(chars);
    }

    private void reverse(char[] c,int i,int n) {
        if(i<=n/2){
            char temp = c[i];
            c[i] = c[n-i];
            c[n-i] = temp;
            reverse(c,i+1,n);
        }
    }

    public void unitTest(){
        String str = "shiv";
        System.out.println(reverseWord(str));
    }
}
