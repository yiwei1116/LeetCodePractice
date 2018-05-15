package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> gernerate(int numRows){



        List<List<Integer>> triangleList = new ArrayList<List<Integer>>();

        if (numRows == 0) return triangleList;

        // First Row is always [1]
        triangleList.add(new ArrayList<>());
        triangleList.get(0).add(1);

        for(int rowNum = 1 ; rowNum < numRows ; rowNum++){

            List<Integer> row = new ArrayList<Integer>();
            List<Integer> PrevRow = triangleList.get(rowNum-1);

            // The first element is always 1
            row.add(1);



            for (int j=1 ; j < rowNum ; j++){

                row.add(PrevRow.get(j-1)+PrevRow.get(j));

            }

            // The last element is always 1
            row.add(1);
            triangleList.add(row);

        }

        return triangleList;

    }
}
