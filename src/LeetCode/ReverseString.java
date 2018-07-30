package LeetCode;

public class ReverseString {


    public char[] reverseString(String str){

        char[] charString = str.toCharArray();
        int first = 0 ;
        int last = str.length()-1;
        while (first < last ){

            if (!Character.isLetterOrDigit(charString[first]))
                first++;
            else if (!Character.isLetterOrDigit(charString[last]))
                last--;
            else {
                char temp = charString[first];
                charString[first] = charString[last];
                charString[last] = temp;
                first++;
                last--;
            }
        }
        return charString;
    }
    public static void main(String[] args){

        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("a,b$c13  5?"));


    }
}
