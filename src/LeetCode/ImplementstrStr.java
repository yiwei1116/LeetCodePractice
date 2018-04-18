package LeetCode;



public class ImplementstrStr {
    /***
     *  Implement strStr()
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     *Example 1:
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     *
     * Example 2:
     * Input: haystack = "aaaaa", needle = "bba"
     * Output: -1
     *
     *
     * @param haystack
     * @param needle
     * @return
     */

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 )
            return 0;
        int i = 0;
        int j = 0;
        if (haystack.indexOf(needle) >= 0 )
            return haystack.indexOf(needle);
        else
        return -1;
    }



}
