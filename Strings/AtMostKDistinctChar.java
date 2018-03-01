package com.sgupta50.strings;

import java.util.HashMap;
import java.util.Set;

public class AtMostKDistinctChar
{

    public static void main(String args[])
    {
        System.out.println(lengthOfLongestSubstringKDistinct("eceba", 2));
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k)
    {
        int maxSubStr = 0;
        for(int c = 0; c < s.length(); c++)
        {
            for(int i = 1; i <= s.length() - c; i++)
            {
                String subStr = s.substring(c, c + i);
                if(findUniqueCharacters(subStr).size() <= k && maxSubStr < subStr.length())
                { maxSubStr = subStr.length(); }
            }
        }
        return maxSubStr;
    }

    public static Set<Character> findUniqueCharacters(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            }
            else
            { map.put(c, 1); }
        }
        return map.keySet();
    }
}
