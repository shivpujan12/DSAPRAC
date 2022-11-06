import java.util.List;

public class MiddleNodeLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode itr = head;
        int size = getSize(head);
        int middle = 0;
        if(size%2==0){
            middle = size/2;
        } else {
            middle = (size/2)+1;
        }

        while (size-- != middle) {
            itr = itr.next;
        }
        return itr;
    }

    private int getSize(ListNode head) {
        ListNode itr = head;
        int size = 0;
        while (itr != null) {
            size++;
            itr = itr.next;
        }
        return size;
    }

    public void unitTest() {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5,
                                                new ListNode(6))))));

        System.out.println(middleNode(head).val);
    }
}
