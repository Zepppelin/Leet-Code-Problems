class Solution 
{
    public boolean isHappy(int n) 
    {
       HashSet<Integer> visited = new HashSet<>();
       while(!visited.contains(n)) 
       {
           visited.add(n);
           n = sumOfSquares(n);
           if(n==1) return true;
       }
        return false;
    }
    
    public int sumOfSquares(int n)
    {
        int sum =0;
        while(n!=0)
        {
            int reminder = n%10;
            sum = sum+(reminder*reminder);
            n = n/10;
        }
        System.out.println(sum);
        return sum;
    }
}