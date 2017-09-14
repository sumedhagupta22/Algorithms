package arrays;

import java.util.*;

/*
 * Output true if the input array can be changed to a non-decreasing array
 * by changing at most 1 element, false otherwise.
 */

public class NonDecreasingArray {
	
	private int array[];
	private int n;
	
	public static void main(String args[]){
		
		NonDecreasingArray nd= new NonDecreasingArray();
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		nd.n=in.nextInt();
		nd.array= new int[nd.n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<nd.n;i++){
			nd.array[i]=in.nextInt();
		}
		System.out.println(checkNonDecreasingArray(nd.array));
	}
	
	public static boolean checkNonDecreasingArray(int array[]){
		/*
		 * Brute Force approach to check if there are any two pairs are in decreasing order
		 */
		int count=0;
		for(int i=0;i<array.length-1;i++){
			
			int diff= array[i]-array[i+1];
			if(diff>0){
				count++;
			}
			//System.out.println("count:"+count);
			if(count>=2){
				//System.out.println("count>2");
				return false;			
			}
		}
		return true;
	}

}
