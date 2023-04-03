package javaudemy;

public class coversion {
	public static void main(String args[]) 
	{
		//negative values are stored in the form of 2's complement
		//positive values are stored in normal binary form
		//short is used for less storage space 
		/*int x=-5;  
		System.out.print(Integer.toBinaryString(x));
		*/
		
		
		for(char c=0x0370;c<=0x0380;c++) {
			System.out.print(c);
			System.out.print("       ");
		}
		
		
	}

}
