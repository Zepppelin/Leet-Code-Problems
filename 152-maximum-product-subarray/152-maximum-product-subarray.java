class Solution
{
    public int maxProduct(int[] nums) 
    {
        if(nums.length==1) return nums[0];
        int max = 1;
        int min = 1;
        int res=nums[0];
        
        for(int n : nums)
        {
           int temp = max*n;
           max = Math.max(n,Math.max(temp,min*n));
           min = Math.min(n,Math.min(temp,min*n)); 
           res = Math.max(res,max);
        }
        return res;
    }
}