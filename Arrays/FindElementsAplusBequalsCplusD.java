package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindElementsAplusBequalsCplusD {
	
	static int array[]= {1, 2, 3, 4, 5, 6, 7, 8};
	
	public static void main(String args[]){
		
		Map<Integer, ArrayList<Integer>> map= new HashMap<Integer,ArrayList<Integer>>();
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				int sum= array[i]+array[j];
				
				if(map.containsKey(sum)){
					ArrayList<Integer> arrayList=map.get(sum);
					System.out.println(arrayList.get(0) + " " + arrayList.get(1) +" and " + array[i] + " " + array[j]);
				}
				else{
					ArrayList<Integer> arrayList= new ArrayList<Integer>();
					arrayList.add(array[i]);
					arrayList.add(array[j]);
					map.put(sum, arrayList);
				}			
			}
		}
	}

}
