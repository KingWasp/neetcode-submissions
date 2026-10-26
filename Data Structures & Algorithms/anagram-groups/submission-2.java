class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> map = new HashMap<>(); 

        for (String s : strs)
        {
            char[] t = s.toCharArray(); 
            Arrays.sort(t);
            String w = new String(t);  
            map.putIfAbsent(w, new ArrayList<>());
            map.get(w).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
/*
Create a HashMap, it'll be in key-value pairs

Key will be the anagram but in a sorted char Array format, if it matches, add it in there

If it doesn't match, put it in 

Then return the list of all values. 



*/