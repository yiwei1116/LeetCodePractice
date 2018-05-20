package LeetCode;

import java.util.HashSet;
import java.util.Hashtable;

public class LinkedListCycle {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static boolean hasCycle(ListNode head){
        // HashSet doesn't allow duplicate value.
        // You can use where u want to maintain a unique list.

        HashSet<ListNode> nodeList = new HashSet<>();

        while (head!=null){

            if (nodeList.contains(head))
                return true;

            else
            nodeList.add(head);

            head = head.next;

        }
        return false;


    }


    }

