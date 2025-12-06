class Solution {
    public int maxArea(int[] ht) {
        int maxarea = 0 ;
        int left = 0;
        int right = ht.length -1;

        while ( left< right){
            int currht = Math.min(ht[left],ht[right]);
            int curwidth = right - left;
            int currarea = (currht*curwidth);
            maxarea = Math.max(maxarea,currarea);

            if (ht[left] < ht[right]){
                left++;
            }
            else{
                right--;
            }


        }
        return maxarea;
        
    }
}