import java.util.Scanner;

public class StringCode1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String :");
		String s1=sc.nextLine();
		
		for(int i=0;i<s1.length();i++)
		{
			
			System.out.print(" "+s1.charAt(i));
		
		
		}
		int i=0;
		int count=0;
		for( i=0;i<s1.length();i++)
		{
			if(s1.indexOf(i)!= s1.indexOf(i+1)) {
				count ++;
			}
			System.out.println(i);
		}
		
		
		
	
		
		//System.out.println();
		//System.out.println(" "+s1.indexOf("v"));
		
	}

}
