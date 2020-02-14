import java.util.*;
public class PhoneNumber {
	
	public static Map<String, String> getPhoneNumber(Map<String, String> m, String[] names){
		Map<String, String> m1=new LinkedHashMap<String, String>();
		String name="";
		String num="";
		Iterator<Map.Entry<String, String>> itr=m.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> entry=itr.next();
			for(int i=0;i<names.length;i++){
				if(names[i].equals(entry.getKey())){
					name=entry.getKey();
					num=entry.getValue();
				}
				m1.put(name, num);
			}
			
		}
		return m1;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of Entries :");
		int n=s.nextInt();
		String name;
		String num;
		
		
		Map<String, String> map=new LinkedHashMap<String, String>();
		System.out.println("Enter "+n+" name and number..");
		for(int i=0;i<n;i++){
			name=s.next();
			num=s.next();
			if(num.length()!=10){
				System.out.println("Invalid number please enter again. ");
				num=s.next();
			}
			map.put(name, num);
		}
		System.out.println(map);
		System.out.println("Enter number for finding Phone Number :");
		int m=s.nextInt();
		String[] names=new String[m];
		System.out.println("Enter name to find phone number");
		for(int i=0;i<m;i++){
			names[i]=s.next();
		}
		Map<String, String> map2=getPhoneNumber(map,names);
		System.out.println(map2);
		Iterator<Map.Entry<String, String>> itr=map2.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, String> entry=itr.next();
			for(int i=0;i<names.length;i++){
				if(names[i].equals(entry.getKey())){
					System.out.println("Number for "+entry.getKey()+" is : "+entry.getValue());
				}else{
					System.out.println("Number for "+names[i]+" is not existing.");
					break;
				}
			}
		}
	}
}