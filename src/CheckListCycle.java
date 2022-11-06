import java.util.HashMap;
import java.util.List;

public class CheckListCycle {


    public boolean approach2(ListNode head) {
        while(head!=null){
            if(head.val == Integer.MIN_VALUE){
                return true;
            }
            head.val = Integer.MIN_VALUE;
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        int i =0;
        while(head!=null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head,i++);
            head = head.next;
        }
        return false;
    }

    public void unitTest() {
        ListNode l = new ListNode(3,
                new ListNode(2,
                        new ListNode(0,
                                new ListNode(-4))));
        System.out.println(hasCycle(l));
    }
}
