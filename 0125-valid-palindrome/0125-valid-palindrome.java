class Solution {
    public boolean isPalindrome(String s) {
       boolean b=true;
       if (s==" ")
       {
        b=true;
       } 
       s=s.toLowerCase();
       s=s.replaceAll("[^a-zA-Z0-9]", "");
       int n=s.length()-1;
       for (int i=0;i<=n;i++)
       {
        if (s.charAt(i)!=s.charAt(n-i))
        {
            b=false;
        }
       }
       return b;
    }
}