package misc;

import java.util.Scanner;

public class HammingDistance {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x= in.nextInt();
		int y= in.nextInt();
		System.out.println("The Hamming Distance between " + x + " and " + y+ " is: " + hammingdistance(x,y));
		
	}
	
	public static int hammingdistance( int x, int y){
		return Integer.bitCount(x ^ y);
	}

}
