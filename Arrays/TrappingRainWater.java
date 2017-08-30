
public class TrappingRainWater {
	
	public static void main(String args[])
	{
		int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
		int maxL=0,maxR=0;
		int water=0;
		int n= arr.length;
		int i=0;
		int j=n-1;
		while(i<=n-1){
			if(i<j){
				if(maxL<=arr[i])
				{				
					maxL= arr[i];
					//System.out.println("max"+maxL);
				}
				if(maxR<=arr[j])
				{				
					maxR= arr[j];
					//System.out.println("max"+maxL);
				}
				j--;
			}
			
			if(maxR>=maxL){
				int trapped= maxL-arr[i];
				water+= trapped;
				//System.out.println("trapped"+trapped);				
			}	
			i++;
			
		}
		System.out.println(water);
	}
}

