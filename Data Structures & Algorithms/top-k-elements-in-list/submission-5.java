public class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>(); 

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        } 


        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            heap.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        while (heap.size() > k) 
        {
            heap.poll();
        }

        int[] res = new int[k];

        for (int i = 0; i < k; i++)
        {
            res[i] = heap.poll()[0];
        }
        return res; 
    }
}
/*
Min-heap solution

HashMap or Bucket Sort (I prefer HashMap)

Sort the min heap based on frequency

Build a min heap based on frequencies 1 -> 2 -> 3

Loop thru the min heap, polling it so long as it is larger than k, which results in the two largest frequencies. 

DSA: HashMap

We want to return an array, with the k number of most frequent elements

Sort nums, into a HashMap of number -> Frequency 

map(0) -> 1,1
map(1) -> 2,2
map(2) -> 3,3

move hashmap -> sortable -> ArrayList (of arrays)

-> [[1,1], [2,2], [3,3]]
Sort ArrayList by Frequency (e.g. the 1st index of the i'th array)
-> [[3,3], [2,2], [1,1]]

Loop thru the array k times returning back each element in the array. 

*/

/*
Sol 2: Bucket Sort
Sort the array into bucket sort -> [1,2,2,3,3,3] -> [1,2,3]
Create an array, minimum size of arr.length

Find the k highest frequencies

Convert back to indicies of the original array

Return that

*/