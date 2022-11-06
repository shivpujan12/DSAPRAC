import java.util.ArrayList;

public class TwinSum {

    public int pairSum(ListNode head) {
        ListNode itr = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(itr!=null){
            list.add(itr.val);
            itr = itr.next;
        }
        int maxSum = 0;
        for (int i = 0; i < (list.size())/2; i++) {
            int sum = list.get(i) + list.get(list.size()-1-i);
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public void unitTest(){
        ListNode l = new ListNode(1,
                new ListNode(10000));

        System.out.println(pairSum(l));

    }
}
