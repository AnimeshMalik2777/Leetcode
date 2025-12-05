class Solution {
    public int search(int[] array, int key) {
        int start = 0;
        int end = array.length-1;
        while (start<=end){
            int mid = (start+end)/2;
            if(array[mid]==key){
                return mid;
            }
            else if(array[mid]<key){
                start= mid+1;
                
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}