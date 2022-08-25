class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set = new HashSet<>();
        for(Integer I : nums)
        {
           if(set.add(I)==false) return true;
        }
        return false;
    }
}