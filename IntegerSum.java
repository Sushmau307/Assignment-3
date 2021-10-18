import java.util.*;
public class IntegerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the numbers seperated by commas");
    String n=scan.next();
    
    StringTokenizer st=new StringTokenizer(n,",");
    int sum=0;
    while(st.hasMoreTokens())
    {
    	int num=0;
    	num=Integer.parseInt(st.nextToken());
    	System.out.println("Number is " +num);
    	sum=sum+num;
    	
    }
    System.out.println("Sum is "+sum);
    		
	}

}
