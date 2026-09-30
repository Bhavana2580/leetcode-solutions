class Solution {
    public boolean checkZeroOnes(String s) {
        int count_0=0;
        int count_1=0;
        int maxi_0=0;
        int maxi_1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count_1++;
                maxi_1=Math.max(count_1,maxi_1);
                count_0=0;
            }
            else{
                count_0++;
                maxi_0=Math.max(count_0,maxi_0);
                count_1=0;
            }
        }
        if(maxi_1>maxi_0){
            return true;
        }
        return false;
    }
}