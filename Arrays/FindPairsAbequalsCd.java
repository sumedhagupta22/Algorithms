package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindPairsAbequalsCd {
	
	/*
	 * http://www.geeksforgeeks.org/find-pairs-ab-cd-array-satisfy-ab-cd/
	 * 
	 * Given an array of distinct integers, the task is to find two pairs 
	 * (a, b) and (c, d) such that ab = cd, where a, b, c and d are distinct elements.
	 */
	static int array[]= {1, 2, 3, 4, 5, 6, 7, 8};
	
	public static void main(String args[]){
		
		Map<Integer, ArrayList<Integer>> map= new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				int prod= array[i]*array[j];
				
				if(map.containsKey(prod)){
					ArrayList<Integer> arrayList=map.get(prod);
					System.out.println(arrayList.get(0) + " " + arrayList.get(1) +" and " + array[i] + " " + array[j]);
				}
				else{
					ArrayList<Integer> arrayList= new ArrayList<Integer>();
					arrayList.add(array[i]);
					arrayList.add(array[j]);
					map.put(prod, arrayList);
				}			
			}
		}
	}
}
