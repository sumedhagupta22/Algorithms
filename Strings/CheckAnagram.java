package com.sgupta50.strings;

import java.util.Arrays;

public class CheckAnagram
{
    public static void main(String args[]){
        String s="ate";
        String t="tea";
        CheckAnagram c= new CheckAnagram();
        System.out.println("Is Anagram using checkUsingSort: " + c.checkUsingSort(s, t));
        System.out.println("Is Anagram using checkWithoutSort: " + c.checkWithoutSort(s, t));
    }

    public boolean checkUsingSort(String s, String t){

        if(s.length()!= t.length())
            return false;
        char[] s_arr= s.toCharArray();
        char[] t_arr= s.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        return Arrays.equals(s_arr,t_arr);

    }

    public boolean checkWithoutSort(String s, String t){

        if(s.length()!= t.length())
            return false;
        int freq[]= new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0)
                return false;
        }
        return true;

    }
}

