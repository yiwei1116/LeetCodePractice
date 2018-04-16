package LeetCode;

/**
 * Created by yiwei on 2018/4/15.
 */
public class MergeTwoSortedLists {
    /**
     *
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     *
     *
     * Example:
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     */


    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeTwoLists(ListNode L1,ListNode L2){

        if ( L1 == null ) return L2;
        if ( L2 == null ) return L1;

        if (L1.val < L2.val ){
            L1.next = mergeTwoLists(L1.next,L2);
            return L1;
        }else {
            L2.next = mergeTwoLists( L1, L2.next);
            return L2;

        }










    }
}
