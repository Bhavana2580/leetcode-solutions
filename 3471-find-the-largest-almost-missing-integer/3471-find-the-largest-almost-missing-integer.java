class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int left=0;left<=nums.length-k;left++){
            Set<Integer>set=new HashSet<>();
            for(int right=left;right<left+k;right++){
                set.add(nums[right]);
            }
            for(int num:set){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int ans=-1;
        for(int num:map.keySet()){
            if(map.get(num)==1){
                ans=Math.max(ans,num);
            }
        }
        return ans;
    }
}