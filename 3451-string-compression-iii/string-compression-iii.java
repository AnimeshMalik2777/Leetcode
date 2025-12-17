class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder("");
        for(int i =0; i <word.length(); i ++){
            char ch = word.charAt(i);
            Integer count =1;
            while(i < word.length()-1 && word.charAt(i) == word.charAt(i+1) && count< 9){
                count ++;
                i++;
                }
                 sb.append(count);
                sb.append(ch);
            

        }
        return sb.toString();
    }
}