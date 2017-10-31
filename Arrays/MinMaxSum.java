package arrays;

import java.util.Arrays;

public class MinMaxSum {
	
	static int array[]= {1, 2, 3, 4, 5};
	
	public static void main(String args[]){
		/*
		 * https://www.hackerrank.com/challenges/mini-max-sum/problem
		 */
		long max=0,min=0;
		Arrays.sort(array);
		for(int i=array.length-1;i>0;i--) max+=array[i];
		for(int i=0;i<array.length-1;i++) min+=array[i];
		System.out.println(min + " " + max);
	}
	

}
