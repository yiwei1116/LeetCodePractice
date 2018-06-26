package LeetCode;

/**
 * Created by yiwei on 2018/6/4.
 */
public class ReverseBit {

    public static int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result += n & 1; // check last bit 1 or 0
        n >>>= 1;   // CATCH: must do unsigned shift
        if (i < 31) // CATCH: for last digit, don't shift!
            result <<= 1;
    }
    return result;
    }
    }
