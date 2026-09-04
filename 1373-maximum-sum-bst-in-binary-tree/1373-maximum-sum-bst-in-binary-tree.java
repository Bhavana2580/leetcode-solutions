/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class NodeValue{
    public int maxNode,minNode,maxSize,sum;
    NodeValue(int minNode,int maxNode,int maxSize,int sum){
        this.maxNode=maxNode;
        this.minNode=minNode;
        this.maxSize=maxSize;
        this.sum=sum;
    }
 };
class Solution {
    int maxSum=0;
    public NodeValue largestBST(TreeNode root){
        if(root==null){
            return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0,0);
        }
        NodeValue left=largestBST(root.left);
        NodeValue right=largestBST(root.right);
        if(left.maxNode<root.val && root.val<right.minNode){
            int currSum=left.sum+right.sum+root.val;
            maxSum=Math.max(maxSum,currSum);
            return new NodeValue(Math.min(left.minNode,root.val),Math.max(right.maxNode,root.val),left.maxSize+right.maxSize+1,currSum);
        }
        return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(left.maxSize,right.maxSize),0);
    }
    public int maxSumBST(TreeNode root) {
        maxSum=0;
        largestBST(root);
        return maxSum;
    }
}