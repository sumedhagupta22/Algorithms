package arrays;

import java.util.Arrays;
import java.util.*;

public class TwoIntegersSumEqualToInput {
	
	public static void main(String args[]){
		int a[]= {2,5,4,9,6,7,8,1};
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the target number");
		int input= in.nextInt();
		//sort the array
		Arrays.sort(a);
		int i=0;
		int j= a.length-1;
		while(i<=j){
			if(a[i]+a[j]==input){
				System.out.println("The two numbers whose sum is equal to " +input +  " are: " + a[i] + " and " + a[j]);
				System.exit(0);
			}
			else if(a[i]+a[j]>input)
				j-=1;
			else if(a[i] + a[j]< input)
				i+=1;
		}
		System.out.println("The two numbers whose sum is equal to " +input +  "are: " + a[i] + " and " + a[j]);
	}

}
