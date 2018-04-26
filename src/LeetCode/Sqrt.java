package LeetCode;

public class Sqrt {

    public static int mySqrt(int x ){

        int left = 1 ;
        int right = x ;
        while (left <= right){
            int mid = left + (right-left) / 2 ;
            if (x/mid == mid)
                return mid;
            else if (x / mid < mid)
                right = mid - 1 ;
            else
                left = mid + 1 ;
        }

        return right;

    }

    public static int mySqrtV2(int x ) {
        long r = x ;
        while (r*r > x )
            r = ( r + x/r ) / 2 ;


        return (int)r;
    }

    }

