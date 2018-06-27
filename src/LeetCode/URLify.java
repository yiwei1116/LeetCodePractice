package LeetCode;

/**
 * Created by yiwei on 2018/6/27.
 */
public class URLify {
    public static String URLsify(char[] str, int trueLength){
        int spaceCount = 0 , i = 0, index;
        for(i = 0 ; i < trueLength; i++){

            if(str[i]==' ') spaceCount++;

        }
        if(spaceCount > 0) str[trueLength]='\0';
        index = trueLength + 2*spaceCount;
        for( i = trueLength-1 ; i>=0 ; i--)
        {
            if(str[i]==' '){
			str[index-1] = '0';
			str[index-2] = '2';
			str[index-3] = '%';
            index = index - 3 ;
        }
			else{
			str[index-1] = str[i];
            index--;
        }

        }

        String a = new String(str);
        return a;

    }



}
