import java.util.*;
public class Positive {

	
	static boolean isOrder(String s)
	{
		int n=s.length();
		char c[]=new char[n];
		
		for(int i=0;i<n;i++)
		{
			c[i]=s.charAt(i);
		}
		Arrays.sort(c);
		
		for(int i=0;i<n;i++)
		
			if(c[i]!=s.charAt(i))
			return false;
		return true;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="ananya";
    if(isOrder(s)) {
    	System.out.println("positive string");
    }
    else
    	System.out.println("Negative string");
	}
}
	
    

