package com.sgupta50.strings;

public class FindFirstNonRepeating
{

    public static void main(String args[])
    {

        FindFirstNonRepeating f = new FindFirstNonRepeating();
        String str = "loveleetcode";
        int index= f.firstUniqChar(str);
        if(index==-1){
            System.out.println("No unique character found!");
        }
        else
            System.out.println("The first unique character's index is: "+index);
    }

    public int firstUniqChar(String str)
    {
        int index = -1;
        int freq[] = new int[256];

        /*
        traversing through the string and assigning frequency for each character
        */
        for(int i=0; i< str.length();i++)
            freq[str.charAt(i) - 'a']+=1;
         /*
        traversing through the string and retrieving the first char with frequency 1
        */
        for(int i=0; i<str.length();i++)
        {
            if(freq[str.charAt(i) - 'a'] == 1)
                return i;
        }
        return index;

    }

}
