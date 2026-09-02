class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>(); 

        for (int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        } 

        list.sort((a, b) -> Integer.compare(b[1], a[1]));

        int[] res = new int[k];

        for (int i = 0; i < k; i++)
        {
            res[i] = list.get(i)[0];
        }
        return res; 
    }
}

/*
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
/*
Sort the array into bucket sort -> [1,2,2,3,3,3] -> [1,2,3]

Find the k highest frequencies

Convert back to indicies of the original array

Return that

/*
Min-heap
*/