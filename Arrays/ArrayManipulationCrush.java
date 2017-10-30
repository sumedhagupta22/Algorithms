package arrays;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * https://www.hackerrank.com/challenges/crush/problem
 * 
 * You are given a list(1-indexed) of size n , initialized with zeroes. You have to perform m operations on the list
 * and output the maximum of final values of all the n elements in the list. For every operation, you are given three
 * integers a,b and k , and and you have to add value k to all the elements ranging from index to a to b (both inclusive).
 * For example, consider a list a of size 3 . The initial list would be a= [0, 0, 0] and after performing the update 
 * 0(a,b,k) =(2,3,30) , the new list would be = [0,30 ,30 ]. Here, we've added value 30 to elements between indices 2 and 3.
 * Note the index of the list starts from 1.
 */

public class ArrayManipulationCrush {

	
	public static void main(String[] args) {
		
		/*
		 * Input Format
		 * The first line will contain two integers n and m separated by a single space.
		 * Next m lines will contain three integers a,b and k separated by a single space.
		 * Numbers in list are numbered from 1 to n.
		 */
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arraylist= new ArrayList<Integer>();
        for(int i=1;i<=n+1;i++){
        	arraylist.add(0);
        }
        int m = in.nextInt();
        for(int a0 = 0; a0 < m; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            for(int i=a;i<=b;i++){
            	int temp=arraylist.get(i);
            	arraylist.set(i, temp+k);
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
        	max=Math.max(arraylist.get(i), max);
        }
        System.out.println("Max is : "+max);
        in.close();
    }
}

