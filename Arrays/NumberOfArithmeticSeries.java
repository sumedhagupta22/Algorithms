import java.util.ArrayList;

public class NumberOfArithmeticSeries {
	
	public static void main(String args[])
	{
		int a[]={1,2,3,4};
		int count=0;
		
		
		for(int i=0;i<a.length-2;i++)
		{
			int d= a[i+1]-a[i];
			for(int j=i+2;j<a.length;j++){
				if(a[j]-a[j-1]==d){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
