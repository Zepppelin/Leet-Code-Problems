class Solution 
{
    public int characterReplacement(String s, int k) 
    {
       int left = 0;
       int result=0;
       int maxF=0;
       int[] arr = new int[26]; 
       for(int right =0;right<s.length();right++)
       {
           arr[s.charAt(right)-'A']++;
           maxF = Math.max(maxF,arr[s.charAt(right)-'A']);
           while(((right-left+1)-maxF)>k)
           {
               arr[s.charAt(left)-'A']--;
               left++;
           }
           result=Math.max(result,right-left+1);
       }
        return result;
    }
}