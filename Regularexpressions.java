package javaudemy;

public class Regularexpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	String str="a";
		
		//regular expressions 
		
		System.out.println(str.matches("[^abc]"));
		System.out.println(str.matches("[abc]"));
		System.out.println(str.matches("[ABC]"));
		System.out.println(str.matches("[a-z 0-7]"));
		System.out.println(str.matches("[abc][vz]")); 

		//regular expressions with quantifiers
		
		String str1="abcabc";
		
		System.out.println(str1.matches("[abc]*"));
		System.out.println(str1.matches("[a-z]*"));
		
		String str2="mahesh@gmail.com";
		System.out.println("hello"+str2.matches(".*gmail.*"));
		System.out.println("world "+str2.matches("\\w.*@gmail.*"));
	
		
		
		String mail="progarmmer@gmail.com";
        String comp="gmail.com";	
		int i=mail.indexOf("@");
		System.out.println(mail.substring(0, i));
		String comp1=mail.substring(i+1,mail.length());
		System.out.println(comp.equals(comp1));
	*/
		
		int a=10101010;
		//String str=a+"";
		String str=String.valueOf(a);
		System.out.println(str.matches("[01]+"));
	    
		String b="22/11/2002";
		System.out.println(b.matches("([0-2][0-9]|[3][01])/([0][1-9]|[1][0-2])/[0-9]{4}")); 		
	}

}
