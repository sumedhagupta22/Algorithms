package arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleOccuringNumber {
	
	static int array[]= {2,3,4,4,5,2,6,7};

	public static void main(String args[]){
		
		Map<Integer, Integer> map= new HashMap<Integer,Integer>();
		
		for(int i=0;i< array.length;i++){
			if(map.containsKey(array[i])){
				map.put(array[i],map.get(array[i])+1);
			}
			else
				map.put(array[i],1);			
		}
		
		for(Map.Entry<Integer, Integer> mapEntry : map.entrySet()){
			if(mapEntry.getValue()==1)
			System.out.println(mapEntry.getKey() + "\n");
		}
		
	}
}
