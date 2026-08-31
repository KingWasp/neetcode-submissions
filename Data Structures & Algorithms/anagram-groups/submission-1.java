public class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> map = new HashMap<>(); 

        for (String s : strs)
        {
            int[] count = new int[26]; 
            for (char c : s.toCharArray())
            {
                count[c - 'a']++; 
            }
            String key = Arrays.toString(count); 
            map.putIfAbsent(key, new ArrayList<>()); 
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values()); 
    }
}
 
/*
Create HashMap, (which we will return the values of). It will be key-value pairs of the anagram string code, and the array of strings that fit that. 
Loop through all strings in strs, assign a count/array for the characters. 

Assign that value into the HashMap if not already in there. If it is already in there, then add the word to it. 

*/