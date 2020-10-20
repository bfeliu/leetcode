public class MergeTwoSortedLists_Easy21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp1, temp2;
        if(l1==null) l1=l2;
        else if(l2==null) return l1;
        else if(l1.val==l2.val){
            temp1=l1.next;
            temp2=l2.next;
            l1.next=l2;
            l2.next=temp1;
            mergeTwoLists(l1.next, temp2);
        }else if(l1.val < l2.val){
            if(l1.next==null){
                l1.next = l2;
            }else if(l1.next.val<=l2.val) {
                mergeTwoLists(l1.next, l2);
            }else{
                temp1=l1.next;
                temp2=l2.next;
                l1.next=l2;
                l2.next=temp1;
                mergeTwoLists(l1.next, temp2);
            }
        } else{
            return mergeTwoLists(l2,l1);
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        //ListNode l1 = null; ListNode l2 = null;
        //ListNode l1 = null; ListNode l2 = new ListNode(2);
        //ListNode l1 = new ListNode(2), l2=new ListNode(1);
        ListNode list = mergeTwoLists(l1, l2);
        while(list!=null) {
            System.out.println(list.val);
            list=list.next;
        }
        System.out.println("Hello World!");
    }
}
