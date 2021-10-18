import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=scan.nextInt();
     String s=String.valueOf(n);
     
     String res=" ";
     for(int i=0;i<s.length()-1;i++)
    	 {
    	 int r=Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
    	 System.out.println(res);
    	 
    	 }
     System.out.println(s.charAt(s.length()-1));
    	 }

}
