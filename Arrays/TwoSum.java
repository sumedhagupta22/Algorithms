
public class TwoSum {
	
		public static void main(String args[]){
			
			int[] nums={8, 7,2, 15};
			int target=9;
			int o[]= twoSum(nums,target);
			for(int i: o){
				System.out.println(i);
			}
		}
	

	    public static int[] twoSum(int[] nums, int target) {
	    	for(int i=0; i<nums.length;i++){
	    		for(int j=i+1;j<nums.length;j++){
	    			if(nums[j]== target- nums[i]){
	    			return new int[]{i,j};
	    		}  
	    	 }
	    	}
	    	throw new IllegalArgumentException("No two sum solution");
	    }
}

