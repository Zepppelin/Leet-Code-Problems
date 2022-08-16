class Solution
{
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> set = new HashSet<Integer>();
        for(int number : nums)
        {
            set.add(number);
        }
        int maxStreak=0;
        for(int num : nums)
        {
           if(!set.contains(num-1))
           {
               int currentNum = num;
               int currentStreak = 1;
               
               while(set.contains(currentNum+1))
               {
                   currentNum+=1;
                   currentStreak+=1;
               }
               maxStreak = Math.max(maxStreak,currentStreak);
           }
        }
        
        return maxStreak;
    }
}