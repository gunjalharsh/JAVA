  
  import java.util.Scanner;
	class string5
{
	public static void main(String args[])
	{	
		
  
		boolean isDate = false;
      String date1="01/13/2012";
      String datePattern = "\\d{1,2}-\\d{1,2}-\\d{4}";
      
      isDate = date1.matches(datePattern);
      System.out.println("Date :"+ date1+": matches with the this date Pattern:"+datePattern+"Ans:"+isDate);
	  }
	  }