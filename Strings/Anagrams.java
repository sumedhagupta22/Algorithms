
import java.util.Arrays;

public class Anagrams {

	public static void main(String args[])
	{
		String a= "peek";
		String b= "kpep";
		
		String acopy= a.replaceAll(" ","");
		String bcopy= b.replaceAll(" ","");
		boolean status= true;
		if(acopy.length()!= bcopy.length())
		{
			status= false;
		}
		else
		{
			char ar[]= acopy.toLowerCase().toCharArray();
			char br[]= bcopy.toLowerCase().toCharArray();
			Arrays.sort(ar);
			Arrays.sort(br);
			status= Arrays.equals(ar, br);
		}
		if(status)
		{
			System.out.println(" a and b are anagrams");
		}
		else
			System.out.println(" a and b are NOT anagrams");
	}
}
