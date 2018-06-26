package LeetCode;

import java.util.HashMap;

/**
 * Created by yiwei on 2018/6/9.
 */
public class UniqueCharacter {

    public static boolean isUniqueCharacter(String text){

        HashMap<Character,Integer> charTable = new HashMap<Character,Integer>();

        for (int i = 0 ; i < text.length(); i++){

            char c = text.charAt(i);

            if (!charTable.containsKey(c))
                charTable.put(c,1);
            else return false;


        }
            return true;

    }
    // Assume char is small letter
    public static boolean isUniqueChars(String str){

        int checker = 0;
        for (int i = 0 ; i < str.length() ; i++) {

            // use bit victor to check if it is exist. Shift the diff

            int val = str.charAt(i) - 'a';
            int valSh = (1 << val);
            int check = (checker & valSh);
            if (check > 0) return false;

            checker = checker | (1 << val) ;
        }

        return true;



    }
}
