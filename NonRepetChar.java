import java.util.*;
public class NonRepetChar
 {
	public static void main(String[] args) 
	{
		int count=0;

		String s = "hello";
		char [] ch = s.toCharArray();
			for(char c : ch) 
				{
					if(s.lastIndexOf(c)== s.indexOf(c))
						{
							count++;
							//System.out.println(" non repeat char : " + c);
							
							
						}
				
						
				}
				System.out.println("Count is :" +count);
	}
}

