package com.sgupta50.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class GroupAnagrams
{
    public static void main(String args[]){
        String arr[]= {"ate","eat","tea","ten","net","tab"};
        GroupAnagrams g= new GroupAnagrams();
        HashMap<String,List<String>> map= g.group(arr);
        for(String s: map.keySet()){
            System.out.println("["+ s + "]" + map.get(s));
        }
    }

    public HashMap<String, List<String>> group(String arr[]){

        HashMap<String, List<String>> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            char[] char_arr= arr[i].toCharArray();
            Arrays.sort(char_arr);
            String sorted_arr= new String(char_arr);
            if(map.containsKey(sorted_arr)){
                List<String> valueList= map.get(sorted_arr);
                valueList.add(arr[i]);
                map.put(sorted_arr,valueList);
            }
            else{
                List<String> valueList= new LinkedList<>();
                valueList.add(arr[i]);
                map.put(sorted_arr,valueList);
            }
        }
        return map;
    }
}

