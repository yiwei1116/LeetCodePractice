package LeetCode;

/**
 * Created by yiwei on 2018/6/15.
 */
public class Compression {
    public static String Compression(String str){

        StringBuilder buildStr = new StringBuilder();
        int count = 1;
        String compressString;
        for (int i = 0 ; i < str.length()-1; i++){

            if(str.charAt(i) != str.charAt(i+1)){
                buildStr.append(str.charAt(i));
                buildStr.append(count);

                count = 1;

            }
            else{
                count++;

            }

        }
        buildStr.append(str.charAt(str.length()-1));
        buildStr.append(count);

        compressString = buildStr.toString();
        return compressString.length() >= str.length()? str: compressString;


    }
}
