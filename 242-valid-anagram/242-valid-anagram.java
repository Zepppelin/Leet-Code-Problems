class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        //s= s.replaceAll("\\s","");
        //t=t.replaceAll("\\s","");
        
        if(s.length()!=t.length())
        {
            return false;
        }
        else
        {
           // char[] ch1=s.toLowerCase().toCharArray();
           // char[] ch2=t.toLowerCase().toCharArray();
            
              char[] ch1=s.toCharArray();
              char[] ch2=t.toCharArray(); 
              Arrays.sort(ch1);
              Arrays.sort(ch2);
              if(Arrays.equals(ch1,ch2)==false) return false;
              
        }
        return true;
    }
}