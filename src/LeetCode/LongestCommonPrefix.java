package LeetCode;

/**
 * Created by yiwei on 2018/4/12.
 */
public class LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     *
     * case : "edwardshi", "edward", "edwar", "edwardshidd"
     * expect : "edwar"
     *
     * @param str
     * @return
     *
     */

    public static String LogestCommonPrefix(String[] str){

        if (str ==null || str.length==0) {
            return " ";
        }
        String LCP = str[0];

        for(int i = 1; i < str.length ; i++){

            while (str[i].indexOf(LCP)!=0)
            {
                LCP = LCP.substring(0,LCP.length()-1);
                if (LCP.isEmpty())return "";
            }

        }

        return LCP;




    }
}
