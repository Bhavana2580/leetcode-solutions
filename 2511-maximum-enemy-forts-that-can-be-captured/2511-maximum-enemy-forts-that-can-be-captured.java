class Solution {
    public int captureForts(int[] forts) {
        int maxi=0;
        for(int left=1;left<forts.length;left++){
            if(forts[left-1]==1 && forts[left]==0){
                int right=left;
                int count=0;
                while(right<forts.length && forts[right]==0){
                    right++;
                    count++;
                }
                if(right<forts.length && forts[right]==-1){
                    maxi=Math.max(count,maxi);
                }
            }
            if(forts[left-1]==-1 && forts[left]==0){
                int right=left;
                int count=0;
                while(right<forts.length && forts[right]==0){
                    right++;
                    count++;
                }
                if(right<forts.length && forts[right]==1){
                    maxi=Math.max(count,maxi);
                }
            }
        }
        return maxi;
    }
}
