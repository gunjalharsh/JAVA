import java.util.Scanner;
class SumOfPrime
{
   public static void main (String[] args)
   {		
      Scanner scanner = new Scanner(System.in);
      int i =0;
      int num =0;
      int flag = 0;
      String  primeNumbers = "";
      System.out.println("Enter the value of n:");
      int n = scanner.nextInt();
      for (i = 1; i <= n; i++)  	   
      { 		 		  
         		  
         for(num =i; num>n; num++)
         {
	    if(i%num==0)
	    {
	    	flag=1;
	    	break;
	    	
	    	
	    }
	 }
		if(flag==0)
		{
			return;
			
		}
         return;
         
         
      }	
      System.out.println("Prime numbers from 1 to n are :");
      System.out.println(primeNumbers);
   }
}