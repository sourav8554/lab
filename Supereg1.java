package operators1;


class Room{
	int l,b;
	Room(int x,int y){
		l=x;
		b=y;
	}
	void area() {
		int result;
		result=l*b;
		System.out.println("Area is : "+result);
	}
}
class Bedroom extends Room{
	int h;
	Bedroom(int x, int y, int z){
		super(x,y);
		h=z;
	}
	void volume() {
	int result;
	result=l*b*h;
	System.out.println("Volume is : "+ result);
}}
public class Supereg1 {
	public static void main(String[] args) {
		Bedroom b=new Bedroom(10,20,30);
		b.area();
		b.volume();
	}
}

	

