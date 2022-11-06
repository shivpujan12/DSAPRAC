public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        ListNode itr = head.next;
        ListNode toReturn = null;
        ListNode itr2 = null;
        int sum = 0;
        while (itr != null) {
            sum += itr.val;
            if (itr.val == 0) {
                if(toReturn==null){
                    toReturn = new ListNode(sum);
                    itr2 = toReturn;
                } else {
                    itr2.next = new ListNode(sum);
                    itr2 = itr2.next;
                }
                sum=0;
            }
            itr = itr.next;
        }
        return toReturn;
    }

    public void unitTest() {
        ListNode test = new ListNode(0,
                new ListNode(1,
                        new ListNode(0,
                                new ListNode(3,
                                        new ListNode(0,
                                                new ListNode(2,
                                                        new ListNode(2,
                                                                new ListNode(0))))))));
        ListNode l = mergeNodes(test);
        while(l!=null){
            System.out.println(l.val);
            l = l.next;
        }
    }
}
