class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length; 
        int[] preFix = new int[n]; 
        int[] postFix = new int[n];
        int[] result = new int[n]; 
        int prod = 1;  
        for (int i = 0; i < n; i++)
        {
            preFix[i] = nums[i] * prod; 
            prod = preFix[i];
        }

        prod = 1; 

        for (int i = n-1; i > -1; i--)
        {
            postFix[i] = nums[i] * prod; 
            prod = postFix[i];
        }

        for (int i = 0; i < n; i++)
        {
            if (i == 0)
            {
                result[i] = postFix[i + 1];
            }
            else if (i == n - 1)
            {
                result[i] = preFix[i - 1]; 
            }
            else
            {
                result[i] = preFix[i - 1] * postFix[i + 1]; 
            }
        }
        return result; 
    }
}  

/*
Prefix & Postfix Products
1. Compute the prefix Products -> create a new array, 
[1, 2, 4, 6] -> [1, 2, 8, 48]

2. Compute the postfix products
[1, 2, 4, 6] -> [48, 48, 24, 6]

3. Multiply the prefix product and the postfix product of the indices left and right of the index we're skipping. 

Assuming it's 4 indices, 
E.g. When we're on index 3, we take prefix[2] * postfix[4] 
E.g. when we're on index 0, we take 1 * postfix[3]
E.g. when we're on index 4, we take prefix[3] * 1


*/ 