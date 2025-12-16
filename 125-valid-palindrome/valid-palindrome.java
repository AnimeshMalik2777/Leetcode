class Solution {
    public boolean isPalindrome(String s) {
        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int len = result.length();
        int i=0;
        while (i<(len/2)){
            if(result.charAt(i) != result.charAt(len-i-1)){
                return false;
            }
                i++;
        }
        return true;
        
    }
}