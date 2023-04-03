package javaudemy;
import java.util.*;

public class collection_frame {

	public static void main(String[] args) {
		
		ArrayList <Integer> a1=new ArrayList<>(20);
		ArrayList <Integer> a2=new ArrayList<>(List.of(30,3,2,4,5,6,7,8));
		a1.add(10);
		a1.add(20);
		a1.addAll(a2);
		System.out.println(a1);
		System.out.println(a1.get(0));
		System.out.println(a1.lastIndexOf(30));
		
		LinkedList <Integer> a11=new LinkedList<>();
		LinkedList <Integer> a22=new LinkedList<>(List.of(3,4,6,8));
		a11.add(19);
		a11.add(2);
		a11.addAll(a22);
		System.out.println(a11);
		
		ArrayDeque <Integer> a12=new ArrayDeque<>();
		a12.offerLast(10);
		a12.offerLast(15);a12.offerLast(14);a12.offerLast(13);a12.offerLast(12);a12.offerLast(11);
		System.out.println(a12);
		a12.offerFirst(16);a12.offerFirst(19);		
		System.out.println(a12);
		
		PriorityQueue <Integer> q1= new PriorityQueue <>();
		q1.add(20);q1.add(10);q1.add(30);q1.add(5);q1.add(15);q1.add(3);
		System.out.println(q1);//print as a binary tree r,l,
		
		
		HashSet <Integer> q2=new HashSet<>();
		q2.add(10);
		q2.add(20);
		q2.add(30);
		System.out.println(q2);
		
		TreeSet <Integer> q22=new TreeSet<>(List.of(10,30,50,70,10,40));
		System.out.println(q22);
		
		TreeMap <Integer,String> q21=new TreeMap<>(Map.of(0,"a",1,"b",2,"c")); 
		System.out.println(q21);
		HashMap <Integer,String> q12=new HashMap<>(Map.of(0,"a",1,"b",4,"c",3,"d")); 
		System.out.println(q12);
		
		
		LinkedHashMap <Integer,String> q23=new LinkedHashMap<>();//makes note of the insertion order 
		q23.put(1,"a");q23.put(4,"c");q23.put(2,"d");q23.put(5,"t");
		System.out.println(q23);
		
		Properties w1=new Properties();
		w1.setProperty("Brand", "HP");w1.setProperty("Processor", "i5");w1.setProperty("OS", "windows");
		System.out.println(w1);
		
		String s="name=mahesh;address=AP;country=India";
		StringTokenizer stk=new StringTokenizer(s,"=;");
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		
		BitSet b1=new BitSet();
		b1.set(0);b1.set(2);b1.set(4);b1.set(6);b1.set(8);
		System.out.println(b1);
		System.out.println("the bit 1 is not set it will give false="+b1.get(1));System.out.println("the bit 0 is not set it will give true="+b1.get(0));
		BitSet b2=new BitSet();
		b2.set(0);b2.set(1);b2.set(2);b2.set(3);b2.set(4);b2.set(5);b2.set(6);b2.set(7);
		b1.or(b2);
		System.out.println(b1);
		
	}
	
	

}
