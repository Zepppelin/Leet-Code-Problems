class Solution 
{
    public int countSubstrings(String s) 
    {
        int count =0;
        for(int i=0;i<s.length();i++)
        {
           for(int j =i+1;j<=s.length();j++) 
           {
               String sub = s.substring(i,j);
               if(isPalindrome(sub)==true)
               {
                  count++; 
               }
           }
        }
        return count;
    }
    public boolean isPalindrome(String str)
    {
        int n = str.length()-1;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i)) return false;
        }
        return true;
    }
}