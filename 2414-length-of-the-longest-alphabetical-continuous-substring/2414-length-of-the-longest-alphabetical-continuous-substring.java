class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int maxi=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)+1){
                count+=1;
                maxi=Math.max(count,maxi);
            }
            else{
                count=1;
            }
        }
        return maxi;
    }
}