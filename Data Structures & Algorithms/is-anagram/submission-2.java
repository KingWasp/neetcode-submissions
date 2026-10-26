class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray(); 

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }
}


/*
- 2 string, s & t
- if they have the same characters, the same number of times, they're anagrams


- HashMap, cycle through and note how many times the letter comes up


- Other solution:
Convert string into a char array, sort the array, and compare if both are equal. Much simpler. 





*/