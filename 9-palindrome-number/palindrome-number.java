class Solution {
    public boolean isPalindrome(int num) {
        if(num<0){
            return false;
        }
        int original = num;
        int rev = 0;
        while(num!=0){
            int digit = num%10;
            rev = rev*10+digit;
            num/=10;

        }
        return original==rev;

        
    }
}