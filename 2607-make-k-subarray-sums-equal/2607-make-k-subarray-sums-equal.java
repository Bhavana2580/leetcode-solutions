class Solution {
    public long makeSubKSumEqual(int[] arr, int k) {
        int l=arr.length;
        int groups=gcd(l,k);
        long ans=0;
        for(int i=0;i<groups;i++){
            List<Integer>list=new ArrayList<>();
            int cur=i;
            do{
                list.add(arr[cur]);
                cur=(cur+k)%l;
            }while(cur!=i);
            Collections.sort(list);
            int median=list.get(list.size()/2);
            for(int x:list){
                ans+=Math.abs(x-median);
            }
        }
        return ans;
    }
    public int gcd(int n,int k){
        while(k!=0){
            int temp=k;
            k=n%k;
            n=temp;
        }
        return n;
    }
}