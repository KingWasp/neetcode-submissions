class Solution {
    public int longestConsecutive(int[] nums) 
    {
        int longest = 0; 
        Set<Integer> set = new HashSet<>(); 
        
        for (int n : nums)
        {
            set.add(n); 
        }


        for (int n : set)
        {
            if (!set.contains(n-1))
            {
                int length = 1; 

                while (set.contains(n + length))
                {
                    length++;
                }
                longest = Math.max(longest, length); 
            }
        }
        return longest; 
    }
}

/*
given array of nums

return length of longest consecutive sequence, e.g. each element is 1 after the other

One solution: 
Sort the array 

Then loop through it, increasing the length for everytime a +1 is after it. 

If +1 is not encountered, then reset the length to 0, store the original length in a different array, and repeat. Then return the largest out of those numbers


HashSet solution:
convert list into numSet (hashset)

go thru the entire set, for each num
- if num - 1 is NOT in the list, then num is the start of the sequence, update longest while num + 1 exists

- if num - 1 is in the list 



*/