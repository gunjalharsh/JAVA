import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class PrimeThree {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a Number");  
	      int n1 = in.nextInt();  
	      
	      String str=Integer.toString(n1);
	      
	     // System.out.println(str.indexOf("2"));
	      
	      String[] arr=str.split("");
	      
	    //  System.out.println(""+Arrays.toString(arr));
	      
	     
	     
	     int size = arr.length;
	      int [] arr1 = new int [size];
	      for(int i=0; i<size; i++) {
	         arr1[i] = Integer.parseInt(arr[i]);
	      }

	        for (int i=0;i<arr1.length;i++) {
	            System.out.println(arr[i]);}
	   
	        
	      for(int i=0;i<arr1.length;i++)
	      {
	    	  boolean isPrime=true;
	      
	      for(int j=2;j<arr1.length;j++)
	      {
	    	  
	    	  if(i%j==0){
	                isPrime = false;
	                break;
	            }
	      }
	      
	      if(isPrime)
	      {
	    	  
	    	  System.out.println(arr[i] + " is the prime numbers");
	      }
	      }
	      
	     
	     
		 
	      
	      
	
		  
		  
	     
	     
	}
}

