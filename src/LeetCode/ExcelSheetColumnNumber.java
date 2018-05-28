package LeetCode;

import java.util.HashMap;

/**
 * Created by yiwei on 2018/5/28.
 */
public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s){

        HashMap transferTable = new HashMap();

        for (int i = 1; i < 27 ; i++)
        {
            transferTable.put(Character.toChars(i+64),i);

        }
        int num = 0 ;
        int init = 0;

        if (s.length()==1)
            return (int)transferTable.get(s.charAt(init));
        else {

        while (init+1 < s.length()) {
            num = (int) transferTable.get(s.charAt(init));
            num = 26 * num ;
            init++;

        }
            num = num +  (int) transferTable.get(s.charAt(init));
        }






        return num;
    }


}
