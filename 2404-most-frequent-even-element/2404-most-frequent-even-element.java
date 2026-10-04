class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
        }
        int key=Integer.MAX_VALUE;
        int value=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>value){
                value=entry.getValue();
                key=entry.getKey();
            }
            else if(entry.getValue()==value && entry.getKey()<key){
                key=entry.getKey();
            }
        }
        return key==Integer.MAX_VALUE?-1:key;
    }
}