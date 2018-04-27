package LeetCode;

public class ClimbingStairs {

    public static int climbStairs(int n){


        if (n == 1)
            return 1;
        if (n == 2)
            return 2;


        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static int climbStairsV2(int n){

        if (n <= 2 )return n;

        int first = 1 ; // how many step possibilities there are with 1 stair
        int second = 2 ; // how many step possibilities there are with 2 stair
        int third = 0 ;

        for (int i = 3 ; i <= n ; i++){

            third = first + second;
            first = second;  //walk up first to second
            second = third;  //walk up second to third.
        }
            return third;



    }
}
