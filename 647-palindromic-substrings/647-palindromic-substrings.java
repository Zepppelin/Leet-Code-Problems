class Solution 
{
    public int countSubstrings(String s) 
    {
        if(s.length()==0)return 0;
        int result =0;
        
        for(int i=0;i<s.length();i++)
        {
            result+=isPalindrome(i,i,s);
            result+=isPalindrome(i,i+1,s);
        }
       return result;
    }
    public int isPalindrome(int start, int end, String s)
    {
       int count =0;
       while(start>=0 && end <s.length() && s.charAt(start--)==s.charAt(end++))
       {
           count++;
       }
        return count;
    }
}