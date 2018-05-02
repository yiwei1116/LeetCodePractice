package LeetCode;

public class MergeSortedArray {

    public static int[] merge(int[] num1, int m, int[] num2, int n){

         int i = m - 1 ;
         int j = n - 1 ;
         int arrLength = m + n -1 ;
         while (i != -1 && j != -1 ){
             if ( num1[i] > num2[j] )
                    num1[arrLength--] = num1[i--];
             else  num1[arrLength--] = num2[j--];

         }
         while (j != -1)
            num1[arrLength--] = num2[j--];

            return num1;

    }

}
