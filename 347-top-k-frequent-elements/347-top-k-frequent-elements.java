class Solution
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int[] ans = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue()); 
        for(Map.Entry<Integer,Integer> it : map.entrySet())
        {
            pq.add(it);
            System.out.println(pq);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int i = k;
        while(!pq.isEmpty())
        {
           ans[--i] = pq.poll().getKey();
        }
        return ans;
    }
}