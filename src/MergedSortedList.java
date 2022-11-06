import java.util.List;

public class MergedSortedList {
        ListNode l = new ListNode();
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
           ListNode r;
           ListNode head;

           if(list1==null && list2 == null){
               return null;
           }

           if(list1 == null){
               return list2;
           }

           if(list2 == null){
               return list1;
           }

           if(list1.val>list2.val){
               r = new ListNode(list2.val);
               list2 = list2.next;
           } else {
               r = new ListNode(list1.val);
               list1 = list1.next;
           }

           r.next = new ListNode();
           head = r;
           while(list1 != null && list2 != null){
               if(list1.val>list2.val){
                   r.next = new ListNode(list2.val);
                   r = r.next;
                   list2 = list2.next;
               } else {
                   r.next = new ListNode(list1.val);
                   r = r.next;
                   list1 = list1.next;
               }

           }

           while(list2 != null){
               r.next = new ListNode(list2.val);
               r = r.next;
               list2 = list2.next;
           }
           while(list1 != null){
               r.next = new ListNode(list1.val);
               r = r.next;
               list1 = list1.next;
           }
           return head;
        }

    public void unitTest() {
            ListNode l1 = new ListNode();
            ListNode l2 = new ListNode();

           l.showList(mergeTwoLists(l1, l2));

        }
}
