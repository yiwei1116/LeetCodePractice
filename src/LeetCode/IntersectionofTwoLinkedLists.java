package LeetCode;

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {

        public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
            }
        }
        public ListNode getIntersectionNode(ListNode headA, ListNode headB){

            HashSet<ListNode> linkList = new HashSet<>();

            if(headA == null || headB == null) return null;

            while (headA!= null){

                linkList.add(headA);
                headA = headA.next;
            }

            while (headB != null){

                if (linkList.contains(headB))
                    return headB;
                else {
                    linkList.add(headB);
                    headB = headB.next;
                }
            }

            return null;
        }
        public ListNode getIntersectionNodeV2(ListNode headA, ListNode headB){

           if (headA == null || headB == null)return null;

           ListNode a = headA;
           ListNode b = headB;


           while (a!=b){



               a= a == null? headB : a.next;
               b= b == null? headA : b.next;


           }

           return a;



        }






}
