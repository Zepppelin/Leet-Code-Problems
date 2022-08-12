class Solution 
{
    public int[][] merge(int[][] intervals)
    {
        List<int[]> result = new ArrayList<>();
        if(intervals.length==0 || intervals==null) return result.toArray(new int[0][]);
        
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int[] arr : intervals)
        {
            if(arr[0]<=end)
            {
                end = Math.max(end,arr[1]);
            }
            else
            {
                result.add(new int[] {start,end});
                start = arr[0];
                end = arr[1];
            }
        }
        result.add(new int[] {start,end});
        return result.toArray(new int[0][]);
    }
}