/**
 * Created by yiwei on 2018/4/12.
 */
import LeetCode.*;

import java.util.Arrays;
import java.util.LinkedList;
import LeetCode.*;
public class Main {


    public static void main(String[] args) {
        String St = "Mr  Danny     ";
        char[] Str = St.toCharArray();
        int[] num1 = {1,2,3,4,5,6};
        int[] num2 = {2,5,6};
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LeetCode.LinkedList ll = new LeetCode.LinkedList(2);
        ll.addAtTail(8);
        ll.addAtTail(7);
        ll.addAtTail(6);// 2 8 7 6 5 4 3
        ll.addAtTail(5);// 5 0 1 5 6 3 7 5 4
        ll.addAtTail(4);// 7 8 8 1 2 8 0 6 4
        ll.addAtTail(3);
        ll.printList();
        System.out.println("----------LL2------------");
        LeetCode.LinkedList ll2 = new LeetCode.LinkedList(5);
        ll2.addAtTail(0);
        ll2.addAtTail(1);
        ll2.addAtTail(5);
        ll2.addAtTail(6);
        ll2.addAtTail(3);
        ll2.addAtTail(7);
        ll2.addAtTail(5);
        ll2.addAtTail(4);
        ll2.printList();
        LeetCode.LinkedList lsum = new LeetCode.LinkedList(0) ;
        lsum = LeetCode.LinkedList.sumAsLinkedList(ll,ll2);
        System.out.println("=======");
        lsum.printList();
        //System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(Arrays.stream(args).mapToInt(Integer::parseInt).toArray()));
        //System.out.println(URLify.URLsify(Str,9));
    }
}

