class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long ans[]=new long[n];
        Map<Integer,Long>count=new HashMap<>();
        Map<Integer,Long>sum=new HashMap<>();
        for(int i=0;i<n;i++){
            long cnt=count.getOrDefault(nums[i],0L);
            long idxSum=sum.getOrDefault(nums[i],0L);
            ans[i]+=cnt*i-idxSum;
            count.put(nums[i],cnt+1);
            sum.put(nums[i],idxSum+i);
        }
        count.clear();
        sum.clear();
        for(int i=n-1;i>=0;i--){
            long cnt=count.getOrDefault(nums[i],0L);
            long idxSum=sum.getOrDefault(nums[i],0L);
            ans[i]+=idxSum-cnt*i;
            count.put(nums[i],cnt+1);
            sum.put(nums[i],idxSum+i);
        }
        return ans;
    }
}