class Solution {
    public int maximumProduct(int[] nums) {
        int max_prod=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int prod1=nums[0]*nums[1]*nums[nums.length-1];
        int prod2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        max_prod=Math.max(max_prod,Math.max(prod1,prod2));
        return max_prod;
        
    }
}