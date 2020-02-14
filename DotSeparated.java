import java.util.Scanner;

public class DotSeparated  { 

	public static void main(String[] args)
	{

		Scanner str=new Scanner(System.in);
		System.out.print("Enter the Name : ");
		String s=str.nextLine();
		String name[] = s.split(" ");
		
		if(name.length==2) {
		System.out.println(name[1]+" "+name[0].charAt(0)+".");}
		else
		System.out.println(name[2]+" "+name[1].charAt(0) +"." +name[0].charAt(0));


 }



}
