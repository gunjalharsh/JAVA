import java.util.Scanner;
class array2
{
  
 
    public static void main(String args[])
	{
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
		int count=0;
        for(int i=0;i<arr1.length;i++)
		{	
				
            for(int j=0;j<arr2.length;j++)
			{
					
					
                if(arr1[i]==arr2[j])
				{
					count++;
                    System.out.println(arr1[i]);
				
					
				
					
					
                }
							
            }
			
        }
			System.out.println("Count is :" +count);
		
		
    }
	
}

