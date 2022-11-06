public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void showList(ListNode l){
        while(l!=null){
            System.out.println(l.val);
            l = l.next;
        }
    }
}
