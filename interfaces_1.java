package javaudemy;
class phone{
	void call(){System.out.println("phone call");}
	void sms(){System.out.println("phone sms");}
}
interface cam{void click();void record();}
interface musicplayer{void play();void stop();}

class smartphone extends phone implements cam,musicplayer{
	public void vc() {System.out.println("video call");}
	public void wa() {System.out.println("open wa");}
	public void click() {System.out.println("cam click");}
	public void record() {System.out.println("cam record");}
	public void play() {System.out.println("music play");}
	public void stop() {System.out.println("music stop");}
}
public class interfaces_1 {

	public static void main(String[] args) {
		smartphone s=new smartphone();
		s.call();
		s.sms();s.vc();s.wa();s.click();s.record();s.play();s.stop();

	}

}
