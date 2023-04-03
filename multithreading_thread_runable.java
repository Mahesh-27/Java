package javaudemy;

class my extends Thread{
	public void run(){
		int i=1;
		while(true) {
			System.out.println(i+"hello ");
			i++;
			}
		}
	}
class re implements Runnable{
	public void run(){
		int i=1;
		while(true) {
			System.out.println(i+"hello ");
			i++;
			}
		}
	}
public class multithreading_thread_runable {
	public static void main(String[] args) {		
//		my q=new my();                   for thread
//		q.start();
		re w=new re();
		Thread e=new Thread(w);
		e.start();e.setPriority(e.NORM_PRIORITY);;int i=1;
		while(true) {
			System.out.println(i+"world ");
			i++;
			}
		}
}
