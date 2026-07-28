class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String curr=words[i];
            int left=0;
            int right=curr.length()-1;
            while(left<=right){
                if(curr.charAt(left)==curr.charAt(right)){
                    left++;
                    right--;
                }
                else{
                    break;
                }
            }
            if(left>right){
                return curr;
            }
        }
        return "";
    }
}