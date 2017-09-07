import java.util.Scanner;

public class MedianOfTwoSortedArrays {

	public static void main(String args[]){

		Scanner in= new Scanner(System.in);
		System.out.print("Enter the size of the arrays");
		int n= in.nextInt();
		int a[]= new int[n];
		int b[]= new int[n];
		System.out.print("Enter the elements of the first array");
		for(int i=0;i<n;i++){
			a[i]= in.nextInt();
		}
		System.out.print("Enter the elements of the second array");
		for(int i=0;i<n;i++){
			b[i]= in.nextInt();
		}
		// initializing start and end indices for a and b
		int start_a = 0,start_b=0;
		int end_a= a.length-1;
		int end_b= b.length-1;
		System.out.println("Median of the arrays is: "+medianoftwoarrays(a,b,start_a,end_a,start_b,end_b));
	}

	/*
	 * Arguments: Two sorted arrays with same no. of elements and their extreme ends indices
	 * Return: Median of the input arrays
	 */	

	public static double medianoftwoarrays(int a[], int b[],int start_a,int end_a,int start_b,int end_b){
	// setting the mean index for a and b
		int median1_index= (start_a + end_a)/2;
		int median2_index= (start_b + end_b)/2;

		// initializing median for a and b
		int median1= a[median1_index];
		int median2= b[median2_index];

		/*
		 *  Case 1: When both arrays are of size 2.
		 */

		if((end_a-start_a==1) && (end_b-start_b==1)){
			double m= ((double)(Math.max(a[start_a],b[start_b]) + (double)Math.min(a[end_a], b[end_b]))/2);
			return(m);
		}

		/*
		 * Case 2 When both arrays are greater than size 2 but their median is equal
		 */

		if(median1==median2){
			return median1;
		}

		/*
		 * Case 3 When both arrays are greater than size 2 and their medians are not equal
		 */

		//Case 3.1 When median 1 < median 2, we can limit the search in a[median1...] b[...median2]

		if(median1 < median2){
			start_a= median1_index;
			end_b= median2_index;		
		}

		//Case 3.1 When median 2 < median 1, we can limit the search in a[...median1] b[median2...]

		else{
			start_b= median2_index;
			end_a= median1_index;
		}	
		return medianoftwoarrays(a,b,start_a,end_a,start_b,end_b);
	}
}
