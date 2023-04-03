package javaudemy;
import java.io.*;
public class iostreams {

	public static void main(String[] args) {
		byte[] b= {'a','b','c','d','e'};
		ByteArrayInputStream bis= new ByteArrayInputStream(b);
		String str=new String(bis.readAllBytes());
		System.out.println(str);
		int x;
		while((x=bis.read())!=-1) {
			System.out.println((char)x);
		}

	}

}
