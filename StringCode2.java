



import java.util.HashMap;

import java.util.Scanner;



public class StringCode2 {



 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 Scanner sc1 = new Scanner(System.in);

 HashMap<String,Integer> list = new HashMap<String,Integer>();

 System.out.print("Enter number of entries :- ");

 int n = sc.nextInt();



 System.out.println("Enter values :- ");



 for (int i =0;i<n;i++) {

  System.out.print("enter mobile number:");

  String s= sc1.nextLine();

  if(s.length()>9) {



  int num=Integer.parseInt(s);



  System.out.print("enter name:");

  String string = sc1.nextLine();

  list.put(string,num);

  }

  else {

  System.out.print("Invalid Number:");

  break;

  }



 }



 System.out.println(list);

 System.out.print("enter queries:");

 String s2 = sc1.nextLine();

 String output[] = s2.split(" ");

 if(list.containsKey(output[0])){

      System.out.println(list.get(output[0]));

    }

 else

  System.out.println("not record found");

 if(list.containsKey(output[1])){

      System.out.println(list.get(output[1]));

    }

 else

  System.out.println("not record found");

 if(list.containsKey(output[2])){

      System.out.println(list.get(output[2]));

    }

 else

  System.out.println("not record found");







 }



}

