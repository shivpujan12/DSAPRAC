import java.util.Stack;

public class PalindromeLinkList {
    public boolean isPalindrome(ListNode head) {
        //calculating size
        ListNode itr = head;
        int size = 0;
        while (itr != null) {
            size++;
            itr = itr.next;
        }
        if(size==1 || size == 0){
            return true;
        }
        int halfSize = (size / 2);
        itr = head;
        Stack<Integer> s = new Stack<>();
        if (size % 2 == 0) {
            //for even length string
            while (itr != null) {
                //check if half string has passed
                if (halfSize > 0) {
                    s.push(itr.val);
                    halfSize--;
                } else {
                    if (itr.val != s.pop()) {
                        return false;
                    }
                }
                itr = itr.next;
            }
        } else {
            //for odd length string
            while (itr != null) {
                //check if half string has passed
                if (halfSize > 0) {
                    s.push(itr.val);
                    halfSize--;
                } else if (halfSize == 0) {
                    itr = itr.next;
                    halfSize--;
                    continue;
                } else {
                    if (itr.val != s.pop()) {
                        return false;
                    }
                }
                itr = itr.next;
            }
        }

        return true;

    }

    public void unitTest() {
        ListNode test = new ListNode(0,new ListNode(2,new ListNode(2,new ListNode(1))));

        System.out.println(isPalindrome(test));

    }

}
