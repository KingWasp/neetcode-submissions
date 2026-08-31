public class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) 
        {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) 
        {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) 
            {
                return new int[]{i, indices.get(diff)};
            }
        }
        return new int[0];
    }
}

// Create a Hashmap of all the values (values wont be repeated)
//  Iterate thru the array, and find any values that complement in the hashmap
// If it does, return it. If not, return an empty array. 
