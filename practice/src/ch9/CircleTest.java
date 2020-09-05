package ch9;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		if(c1.equals(c2))
			System.out.println("same");
		else
			System.out.println("no");
	}
}
class Circle{
	int i;
	Circle(int i){
		this.i=i;
	}
	public boolean equals(Object o) {
		Circle c = (Circle)o;
		if(this.i==c.i)
			return true;
		return false;
	}
	
}