public class Solution {
    public boolean isValid(String s) 
    {
        Map<Character, Character> pairMap = new HashMap<>(); 

        Deque<Character> bracketStack = new ArrayDeque<>();

        pairMap.put('{', '}');
        pairMap.put('(', ')');
        pairMap.put('[', ']');

        for (char c : s.toCharArray())
        {
            if (pairMap.containsKey(c))
            {
                bracketStack.push(c);
            }
            else
            {
                if (!bracketStack.isEmpty() && (pairMap.get(bracketStack.peek()) == c))
                {
                    bracketStack.pop(); 
                }
                else
                {
                    return false; 
                }
            }
        }

        return bracketStack.isEmpty();


    }
}

/*
Create a Hash Map of the closing bracket to opening bracket in key-value pairs

Create a Stack to transfer the String s of characters onto

Check for an opening bracket -> push it to the stack

If its a closing bracket -> Check if the latest value in the stack is that opening pair

-> Also make sure to check that the stack isn't Empty when you look for the closing bracket

Pop the value of the opening bracket 

Return if the stack is empty
*/