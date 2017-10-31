package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class CompareTriplets {
	
public static void main(String[] args) {
		
		/*
		 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
		 */
		
        Scanner in = new Scanner(System.in);
        int m=2;
        ArrayList<Integer> comp= new ArrayList<Integer>();
        for(int i = 0; i < m; i++){
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int a3 = in.nextInt();
            comp.add(a1);
            comp.add(a2);
            comp.add(a3);        
     }
        int alice=0;
        int bob=0;
        for(int i=0;i<comp.size()/2;i++){
        	if(comp.get(i) > comp.get(i+3)){
        		alice++;
        	}
        	else if(comp.get(i) < comp.get(i+3))
        		bob++;
        }
        
        System.out.println(alice + " " + bob);
        
}
}