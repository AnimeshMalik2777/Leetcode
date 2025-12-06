class Solution {
    public int trap(int[] height) {
        int wT = 0;
        int n = height.length;
        int mL []= new int [n];
        mL[0] = height[0];
        for (int i = 1; i<n; i++ ){
            mL[i] = Math.max(mL[i-1],height[i]);

        }
        int mR[]= new int [n];
        mR[n-1]= height[n-1];
        for( int i=n-2; i>= 0; i --){
            mR[i] = Math.max(mR[i+1],height[i]);
        }
        for(int i =0; i<n; i++){
            int wL= Math.min(mL[i],mR[i]);
            wT += wL-height[i];
        } 
        return wT;
    }
}