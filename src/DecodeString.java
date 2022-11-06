import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        Stack<String> stackA = new Stack<>();
        Stack<String> stackN = new Stack<>();
        String alpha = "";
        String numS = "";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            String cs = String.valueOf(c);

            if(Character.isDigit(c)){
                numS += cs;
            }
            else if(Character.isLetter(c)){
                if(!numS.equals(""))
                    stackN.push(numS);
                stackA.push(cs);
                numS = "";
            } else if(cs.equals("[")){
                stackA.push(cs);
                if(!numS.equals(""))
                    stackN.push(numS);
                numS = "";
            }else if(cs.equals("]")){
                while(true){
                    String p = stackA.pop();
                    if(p.equals("[")){
                        break;
                    } else {
                        alpha = p + alpha;
                    }
                }
                int numI = 0;
                if(stackN.isEmpty()) {
                    numI = 0;
                }else{
                   numI = Integer.parseInt(stackN.pop());
                }
                String k="";
                for (int j = 0; j < numI; j++) {
                    k = k + alpha;
                }
                alpha = "";
                numS = "";
                stackA.push(k);
            }
        }

        String toReturn = "";
        while(!stackA.isEmpty()){
            toReturn = stackA.pop() + toReturn;
        }
        return toReturn;
    }

    public void unitTest(){
        String s = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        System.out.println(decodeString(s));
    }


}
