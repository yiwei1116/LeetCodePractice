/**
 * Created by yiwei on 2018/4/12.
 */
import LeetCode.*;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {




        //System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(Arrays.stream(args).mapToInt(Integer::parseInt).toArray()));
        System.out.println(MergeSortedArray.merge(Arrays.stream(args).mapToInt(Integer::parseInt).toArray(),3,Arrays.stream(args).mapToInt(Integer::parseInt).toArray(),3));
    }
}

