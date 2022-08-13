class Solution 
{
    public boolean isPalindrome(String s) 
    {
        char[] arr=s.toLowerCase().toCharArray();
        int i =0;
        int j = arr.length-1;
        
        while(i<j)
        {
          if(!(arr[i]>='a' && arr[i]<='z' || arr[i]>='0' && arr[i]<='9'))
          {
              i++;
          }
          else if(!(arr[j]>='a' && arr[j]<='z' || arr[j]>='0' && arr[j]<='9'))
          {
              j--;
          }
          else
          {
              if(arr[i]==arr[j])
              {
                 i++;
                 j--;
              }
              else
              {
                 return false; 
              }
          }
        }
        return true;
    }
}