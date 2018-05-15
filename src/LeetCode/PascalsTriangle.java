package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> gernerate(int numRows){


        List<Integer> levelList = new ArrayList<Integer>();
        List<List<Integer>> triangleList = new ArrayList<List<Integer>>();

        if (numRows == 0) return null;
        if (numRows == 1 ) {
            levelList.add(1);
            triangleList.add(new ArrayList(levelList));
            return triangleList;
        }
        if (numRows == 2 ){

            levelList.add(1);
            levelList.add(1);
            triangleList.add(new ArrayList(levelList));
            return triangleList;
        }


        return null;
    }
}
