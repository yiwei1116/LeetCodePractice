package LeetCode;

/**
 * Created by yiwei on 2018/6/3.
 */
public class FactorialTrailingZeroes {

    // 直覺

    public static int trailingZeroes(int n){

        int count = 0 ;
        int num ;
        for (int i = 1 ; i <= n ; i++){

            num = i ;

            while ( num % 5 == 0 && num != 0){

                num = num / 5;
                count++;
            }


        }


        return count;


    }

    public static int trailingZeroesV2(int n){

        if ( n < 5  )return 0;

        int count = 0;
        int num ;

        for (int i = 5 ; i <= n ; i+=5){

            num = i ;

            while (num %5 == 0 )
            {
                num = num / 5;
                count++;
            }

        }




        return count;

    }
}
