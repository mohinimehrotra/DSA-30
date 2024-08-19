package DSA;
class ListNode12 {
    int val;
    ListNode12 next;
    ListNode12() {}
    ListNode12(int val) {
        this.val = val;
    }
    ListNode12(int val, ListNode12 next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeSortedLinkedList {
    public static ListNode12 mergeTwoLists(ListNode12 l1, ListNode12 l2) {
        ListNode12 dummy = new ListNode12(0);
        ListNode12 curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode12 l1 = new ListNode12(1);
        l1.next = new ListNode12(3);
        l1.next.next = new ListNode12(5);

        ListNode12 l2 = new ListNode12(2);
        l2.next = new ListNode12(4);
        l2.next.next = new ListNode12(6);

        ListNode12 mergedList = mergeTwoLists(l1, l2);
        System.out.print("Merged List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val);
            mergedList = mergedList.next;
         }
     }
   }

