package StringFunctions;
public class StringFns {
	public static void main(String[] args) {	
		//Concat
		String s="Hello";
		String s1="July batch";
		String s2="hello";
		System.out.println(s.concat(s1));//HelloJuly batch
		System.out.println(s+s1);//HelloJuly batch
		System.out.println(2+3+s+5+6);//5Hello56
		
		//Equals
		System.out.println(s.equals(s1)); //false
		System.out.println(s.equalsIgnoreCase(s2));//true
		System.out.println(s.equals(s2));//false
		
		//toUpper and toLower
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//length
		System.out.println(s1.length());
		
		//startswith and endswith
		System.out.println(s1.startsWith("July"));//true
		System.out.println(s1.endsWith("batch"));//true
		
		//Contains
		System.out.println(s1.contains("batch"));//true
		
		//trim
		String s3="        Welcome        ";
		String s4=s+s3;
		System.out.println(s4);
		String s5=s3.trim();
		System.out.println(s+s5);
		
		//replace
		String s6="God is great";
		System.out.println(s6.replace("great", "Love"));
		
		//substring
		System.out.println(s6.substring(7));
		System.out.println(s6.substring(0,3));
		
		//Split
		String s7="Hello Luminar Technolab";
		String st[]=s7.split(" ");

		for(String c:st)
		{
			System.out.println(c);
			
		}
		
		//tocharArray
		String s8="Hello";
		char c[]=s8.toCharArray();
		for(char ele:c)
		{
			System.out.println(ele);  //charAt
		}
	}

}
