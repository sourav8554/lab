package javaprogram2;


	class sk{
		int age;
		String name;
	void input(int a,String n) {
	    age=a;
		name=n;
	}
	void display() {
		System.out.println(name+ " "+age);
	}

	public class Object_through {

		public static void main(String[] args) {
			sk obj=new sk();
			sk obj1=new sk();
			obj.input(10, "ram");
			obj1.input(20,"sam");
			obj.display();
			obj1.display();
			
		}

	}}

