package ch6;
class Vehicle{
	 String color;
	int speed;
	void show() {
		System.out.print(color+speed);
	}
	public Vehicle(String color, int speed) {
		this.color=color;
		this.speed=speed;
	}	
}
class Car extends Vehicle{
	int displacement;
	int gears;
	void show() {
		System.out.println(color+speed+displacement+gears);
	}
	public Car(String color, int speed, int displacement, int gears) {
		super(color,speed);
		this.displacement=displacement;
		this.gears=gears;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		Car c = new Car("ÆÄ¶û",200,1000,5);
		c.show();
		System.out.println();
		Vehicle v= c;
		v.show();		
	}

}
