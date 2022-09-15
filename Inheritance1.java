package operators1;

public class Inheritance1 {
void running() {
	System.out.println(" running mode on");
}
}
class Bike extends Inheritance1{
	void run() {
		System.out.println("bike running mode on");
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.run();
		b.running();
	}
}
