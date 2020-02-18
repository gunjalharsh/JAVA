import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexDemo {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		int sum = 0;
		int flag=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size :");
		
		int n=sc.nextInt();
		
		System.out.println("Enter elements ");
		int[] num=new int[n];
		for( int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();

		
		}
		
	
		Scanner n1=new Scanner(System.in);
		
		System.out.println("Enter the number to be search :");
		int num1=n1.nextInt();
		
		for(int i=0;i<num.length;i++)
		{
		
		
			if(num[i]==num1) {
			System.out.println("Index Position :"+i);
			}
			
		}
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]!=0)
			{
			sum+=num[i];
			}
			
		}
			System.out.println("sum is :"+sum);
			

		
	}
}