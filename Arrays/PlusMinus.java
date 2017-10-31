package arrays;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {
	
	/*
	 * https://www.hackerrank.com/challenges/plus-minus/problem
	 */
		
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		double pos=0,neg=0,zero=0;
		for(int i=0;i<n;i++){
			int number= in.nextInt();
			if(number>0)
				pos++;
			else if(number<0)
				neg++;
			else if(number==0)
				zero++;
		}
		DecimalFormat df = new DecimalFormat("#.######");
		//df.setRoundingMode(RoundingMode.FLOOR);
		System.out.println(df.format(pos/n) + "\n" + df.format(neg/n) + "\n" + df.format(zero/n));
	}

}
