package arrays;

public class kthElementOfTwoSortedArrays {
	
	  /*
	   * http://www.geeksforgeeks.org/k-th-element-two-sorted-arrays/
	   */
	public static void main(String args[]){
		
		int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;
        System.out.print("The kth element of two sorted arrays is: "+findkth(arr1, arr2,k));
	}
	
	public static int findkth(int [] arr1, int arr2[], int k){
		
		int m= arr1.length;
		int n= arr2.length;
		int result[]= new int[m+n];
		int i=0,j=0,l=0;
		while(i<m && j<n){
			
			if(arr1[i]< arr2[j])
				result[l++]= arr1[i++];
			else
				result[l++]= arr2[j++];
		}
		
		//if elements are still remaining in the array
		while(i<m)
			result[l++]= arr1[i++];
		while(j<n)
			result[l++]= arr2[j++];
		
		return result[k-1];
	}
}
