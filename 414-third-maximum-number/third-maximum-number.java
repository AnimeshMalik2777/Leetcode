import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = nums[0];

        for( int i = 0; i <nums.length; i ++){
            int val = nums[i];
            if (val> f){
                t = s;
                s = f;
                f = val;
                        
            }
            else if (val > s && val < f){
                t = s;
                s = val;
            }
            else if ( val > t && val< s){
                t = val;

            }
        }
        return(t==Long.MIN_VALUE||s ==Long.MIN_VALUE )? (int)f:(int)t;
       
    }
}