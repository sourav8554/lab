package operators1;


public class Overriding {
void run() {
	System.out.println("running mode on");
}}
class TestOverriding extends Overriding{
	void run() {
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		 TestOverriding to=new  TestOverriding();
		// Overriding or=new Overriding();
		 to.run();
	}
}