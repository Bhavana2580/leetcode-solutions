class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int arr[][]=new int[n+m][2];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i][0]==nums2[j][0]){
                arr[k][0]=nums1[i][0];
                arr[k][1]=nums1[i][1]+nums2[j][1];
                k++;
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                arr[k][0]=nums1[i][0];
                arr[k][1]=nums1[i][1];
                k++;
                i++;
            }
            else{
                arr[k][0]=nums2[j][0];
                arr[k][1]=nums2[j][1];
                k++;
                j++;
            }
        }
        while(i<n){
            arr[k][0]=nums1[i][0];
            arr[k][1]=nums1[i][1];
            k++;
            i++;
        }
        while(j<m){
            arr[k][0]=nums2[j][0];
            arr[k][1]=nums2[j][1];
            k++;
            j++;
        }
        int ans[][]=new int[k][2];
        for(int p=0;p<k;p++){
            ans[p]=arr[p];
        }
        return ans;
    }
}