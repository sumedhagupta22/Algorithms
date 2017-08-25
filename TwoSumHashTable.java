import java.util.*;
public class TwoSumHashTable {

	public static void main(String args[]){
	int[] nums={8,4,2,7};
	int target=9;
	int o[]= twoSum(nums,target);
		for(int i: o){
			System.out.println(i);
		}
	}
	public static int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> map= new HashMap<>();
	
	for(int i=0;i<nums.length;i++){
		int complement= target-nums[i];
		if(map.containsKey(complement)){
			return new int[] {i,map.get(complement)};
		}
		map.put(nums[i],i);		
	}
	throw new IllegalArgumentException("No two Sum Solution");		
	}
}
