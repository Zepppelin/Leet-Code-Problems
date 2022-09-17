class Solution 
{
    public String frequencySort(String s)
    {
        Map<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxHeap.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(!maxHeap.isEmpty())
        {
            Character ch = maxHeap.remove();
            int count=map.get(ch);
            while(count!=0)
            {
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();
    }
}