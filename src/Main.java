/**
 * Created by yiwei on 2018/4/12.
 */
import LeetCode.*;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        String St = "Mr  Danny     ";
        char[] Str = St.toCharArray();
        int[] num1 = {1,2,3,4,5,6};
        int[] num2 = {2,5,6};


        UserLinkedList Ull = new UserLinkedList(10);
        Ull.addAtHead(9);
        Ull.addAtHead(8);
        Ull.addAtTail(7);
        Ull.addAtIndex(2,15);
        UserLinkedList.Node Un = Ull.find(2);
        System.out.print(Un.getData());
        //Ull.printList();

        //System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(Arrays.stream(args).mapToInt(Integer::parseInt).toArray()));
        //System.out.println(URLify.URLsify(Str,9));
    }
}

