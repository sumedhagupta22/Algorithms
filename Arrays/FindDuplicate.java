import java.util.Scanner;

public class FindDuplicate {
	
	/* Assumption 1: Input array is continuous from 0 to n-1 
	 * Assumption 2: There is only one duplicate value
	 * */
	
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int[] a= new int[n];
		System.out.println("Enter a continuos array");
		for(int i=0; i <n;i++){
            a[i] = in.nextInt();
        }
		for(int i=0;i<n;i++){
			int index=Math.abs(a[i]);
			if(a[i]>0)
			a[index]= -a[index];
			else{
				System.out.println("Duplicate element is: "+ Math.abs(a[i]));
				break;
			}
				
				
		}
	}

}

