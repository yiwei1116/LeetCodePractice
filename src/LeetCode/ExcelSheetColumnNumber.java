package LeetCode;

import java.util.HashMap;

/**
 * Created by yiwei on 2018/5/28.
 */
public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s){

        int result = 0;

        for (int i = 0 ; i < s.length(); i++){

            result = result * 26 + s.charAt(i) - 'A' + 1 ;

        }


        return result;




    }


}
