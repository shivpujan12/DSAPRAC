public class RemoveDuplicateFromList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode itr = head;
        ListNode newListNode = null;
        ListNode newHead = null;
        while(itr!=null){
            if(newListNode==null){
                newListNode = new ListNode(itr.val);
                newHead = newListNode;
            } else if(itr.val!=newListNode.val){
                newListNode.next = new ListNode(itr.val);
                newListNode = newListNode.next;
            }
            itr = itr.next;
        }
        return newHead;
    }

    public void unitTest(){
        ListNode l = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(3))))));

        ListNode listNode = deleteDuplicates(l);
        listNode.showList(listNode);

    }
}
