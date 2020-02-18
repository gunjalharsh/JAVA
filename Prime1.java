import java.util.*;
@SuppressWarnings("unused")
class Prime1
{
static int isprime(int num)
{
	int i; 
	
	int flag=0; 
	
	for(i=2; i<num; i++)
	{
		if(num%i==0)
		{
			flag =1;
			break;
		}
	}
	
	if(flag==0)
		return 1;
	else
		return 0;
}

 	public static void main(String args[])
	{
		int j,sum=0,i;
		int arr[] ={1,2,3,4,5,6,7,8,9,10};
		for( i =2;i<arr.length;i++)
		{
			j=isprime(i);
			if(j==1)
			{
			System.out.print(" " +arr[i]);
			sum=sum+arr[i];
			}
			
		}
		System.out.println("\n");
		System.out.println("Sum of indices of prime number :"+sum);
		
	}			
}	