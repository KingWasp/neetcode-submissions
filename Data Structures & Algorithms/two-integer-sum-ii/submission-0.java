class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int left = 0; 
        int right = numbers.length - 1; 
        while (left < right)
        {
            int sum = numbers[left] + numbers[right];
            if (sum == target)
            {
                return new int[]{left + 1, right + 1};
            }
            else if (sum > target)
            {
                right--; 
            }
            else
            {
                left++; 
            }
        }
        return new int[]{left + 1, right + 1};
    }
}

/*
array sorted in increasing order; 

return: INDEX of 2 numbers, in a way they add up to target 

Important restrictions:
index cannot be the same one (the two pointers cannot cross)

index1 < index2 

Solution:
have two pointers, if the sum is too large, move the right pointer down.

If the sum is too little, move the left pointer up 


*/